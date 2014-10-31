package requestTest;


import static org.junit.Assert.assertNotNull;
import infrastructure.Request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.CepLocationAddress;
import model.EndCustomer;
import model.Quote;
import model.QuoteVolume;
import model.ShipmentOrder;
import model.ShipmentOrderVolume;
import model.VolumeType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;


public class RequestMTest {

	private static final Logger LOG = Logger.getLogger("RequestTestLogger");

	// please use a valid api key to get the test running
	private static final String apikey = "your api key";

    @Test
    public void doQuoteRequest () {

    	// create a test quote
    	Quote quote = createTestQuote();

    	// create a post request
    	Request postRequest = new Request("https://api-testing.intelipost.com.br/api/v1/quote", apikey, quote);

        Quote newQuote = null;
        try {
        	// store response of request in new quote object
	        newQuote = (Quote) postRequest.doPostRequest();
        } catch (JsonGenerationException e) {
        	LOG.log(Level.SEVERE, ""+e);
        } catch (JsonMappingException e) {
        	LOG.log(Level.SEVERE, ""+e);
        } catch (IOException e) {
        	LOG.log(Level.SEVERE, ""+e);
        }

        // response object should not be null
        assertNotNull( newQuote );

        // an id should be set in response
        assertNotNull(newQuote.getId());

        // the parameters set in request quote should be stored in response quote
        Assert.assertEquals(quote.getOriginZipCode(), newQuote.getOriginZipCode());
      }

    @Test
    public void doShipmentOrderRequest () {

       	// to post a shipment order, a valid quote id is needed, so at first a quote is posted
    	Request quoteRequest = new Request("https://api-testing.intelipost.com.br/api/v1/quote", apikey, createTestQuote());
    	Quote quote = null;

    	try {
	        quote = (Quote) quoteRequest.doPostRequest();
        } catch (JsonGenerationException e1) {
        	LOG.log(Level.SEVERE, ""+e1);
        } catch (JsonMappingException e1) {
        	LOG.log(Level.SEVERE, ""+e1);
        } catch (IOException e1) {
        	LOG.log(Level.SEVERE, ""+e1);
        }

		// the response quote should not be null
    	assertNotNull(quote);

    	// create a shipment order with the quote id of response quote
    	ShipmentOrder order = createTestShipmentOrder(quote.getId());

    	// create a post request
    	Request postRequest = new Request("https://api-testing.intelipost.com.br/api/v1/shipment_order", apikey, order);

        ShipmentOrder newOrder = null;

        try {
        	// store response of request in new shipment order object
	        newOrder = (ShipmentOrder) postRequest.doPostRequest();
        } catch (JsonGenerationException e) {
        	LOG.log(Level.SEVERE, ""+e);
        } catch (JsonMappingException e) {
        	LOG.log(Level.SEVERE, ""+e);
        } catch (IOException e) {
        	LOG.log(Level.SEVERE, ""+e);
        }

		// the response shipment order should not be null
        assertNotNull(newOrder);

        // the response should contain an id, the posted order should not
        Assert.assertNotEquals(order.getId(), newOrder.getId());

        // the response end customer should contain a state code, the posted end customer should not
        Assert.assertNotEquals(order.getEndCustomer(), newOrder.getEndCustomer());

        // parameters set in the request shipment order, should be stored in the response
        Assert.assertEquals(order.getOrderNumber(), newOrder.getOrderNumber());
        Assert.assertEquals(order.getCustomerShippingCosts(), newOrder.getCustomerShippingCosts());
    }

    @Test
    public void doAddressCompleteRequest () {

    	// response object is CepLocationAddress
    	CepLocationAddress address = new CepLocationAddress();

    	// address complete is a get request, which needs a path variable -> cep_location/address_complete/{cep}
    	Request getRequest = new Request("https://api-testing.intelipost.com.br/api/v1/cep_location/address_complete/04037-002", apikey, address);

    	try {
    		// store the response of get request in cep location address object
	        address = (CepLocationAddress) getRequest.doGetRequest();
        } catch (JsonGenerationException e) {
        	LOG.log(Level.SEVERE, ""+e);
        } catch (JsonMappingException e) {
        	LOG.log(Level.SEVERE, ""+e);
        } catch (IOException e) {
        	LOG.log(Level.SEVERE, ""+e);
        }

    	// response should not be null
    	assertNotNull(address);

    	// for given cep 04037-002 the returned state should be São Paulo
    	Assert.assertEquals("São Paulo", address.getState());

    	// for given cep 04037-002 the returned ibge should be 3550308
    	Assert.assertEquals("3550308", address.getIbge());
    }

    // creates a request body for posting a quote
    private Quote createTestQuote () {

    	List<QuoteVolume> volumes = new ArrayList<>();
    	QuoteVolume volume = new QuoteVolume(VolumeType.BOX, 5.0, 10.0, 20.0, 30.0, 40.0);
    	volumes.add(volume);

    	return new Quote("01001-000", "01001-000", volumes);
    }
    // create a request body for posting a shipment order (a valid quote id has to be passed)
    private ShipmentOrder createTestShipmentOrder (int quoteId) {

    	Map<String, String> providerMap = new HashMap<>();
    	providerMap.put("param1", "DA21367912");

    	ShipmentOrderVolume volume = new ShipmentOrderVolume("testnumber", 100.0, "box", 10.0, 20.0, 30.0, "beverages", 3, false, "SW213456789BR", providerMap);
    	List<ShipmentOrderVolume> volumes = new ArrayList<>();
    	volumes.add(volume);

    	EndCustomer customer = new EndCustomer("Testy", "Tester", "test@project-a.com", "00551234567", "067781239123", "1278312873", "2314234", "R Valia", "2", "loco", "xyz", "poco", "Sao Paulo", "04037-002", "Brasilia", "BR");

    	// generates a random number because order number has to be unique
    	Random randomNumber = new Random();
    	String orderNumber = new Integer(randomNumber.nextInt(1000)).toString();
    	return new ShipmentOrder(quoteId, 2, 12.35, 12.35, orderNumber, DateTime.now().toLocalDate(), customer, volumes);
    }
}
