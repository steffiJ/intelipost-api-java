package infrastructure;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.PropertyNamingStrategy;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import constants.Constants;

public class Request {

	private String url;
	private String apiKey;
	private Object object;
	private ObjectMapper mapper;

	public Request (String url, String apiKey, Object object) {
		this.url = url;
		this.apiKey = apiKey;
		this.object = object;
		initMapper();
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}

	private void initMapper() {
		this.mapper = new ObjectMapper();
		this.mapper.configure( org.codehaus.jackson.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true );
		this.mapper.configure( DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false );
		this.mapper.setPropertyNamingStrategy( PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES );
	}

	public Object doPostRequest () throws JsonGenerationException, JsonMappingException, IOException {

		HttpClient httpClient = HttpClientBuilder.create().build();

		// write the object as string in desired JSON format
	    String stringObject = mapper.writeValueAsString(object);

	    HttpPost postRequest = new HttpPost(url);

	    //set api key for authentication
	    postRequest.setHeader("api_key", apiKey);
	    postRequest.setHeader("Content-type", Constants.CONTENT_TYPE);
	    postRequest.setHeader("platform", Constants.PLATFORM);
	    postRequest.setHeader("plugin", Constants.PLUGIN);
	    postRequest.setEntity(new StringEntity(stringObject));

	    HttpResponse response = httpClient.execute(postRequest);

	    return getResponseObject(response);
	}

	public Object doGetRequest () throws ClientProtocolException, IOException {

		HttpClient httpClient = HttpClientBuilder.create().build();

		HttpGet getRequest = new HttpGet(url);

	    //set api key for authentication
	    getRequest.setHeader("api_key", apiKey);
	    getRequest.setHeader("Content-type", Constants.CONTENT_TYPE);
	    getRequest.setHeader("platform", Constants.PLATFORM);
	    getRequest.setHeader("plugin", Constants.PLUGIN);

	    HttpResponse response = httpClient.execute(getRequest);

	    return getResponseObject(response);
	}

	private Object getResponseObject (HttpResponse response) throws ParseException, IOException {

		// get the response as string
	    String stringResponse = EntityUtils.toString(response.getEntity(), "UTF-8");

	    JsonParser parser = new JsonParser();
	    // parse the response to JSON object
	    JsonObject obj = parser.parse(stringResponse).getAsJsonObject();

	    // object should not be null, otherwise the request failed
	    if (obj != null) {
	    	// if request was successful, it should contain content
	    	if (obj.get("content") != null) {
	    		// return content as object
	    		return mapper.readValue(obj.get("content").toString(), object.getClass());
	    	}
	    	// if the status is ERROR, the request failed
	    	else if (obj.get("status") != null && obj.get("status").toString().equals("\"ERROR\"")) {
	    		// throw an exception, that contains error message of failed request
	    		throw new JsonGenerationException(obj.toString());
	    	}
	    }
	    return null;
	}
}
