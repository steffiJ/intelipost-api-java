package model;

import java.util.List;

public class Quote {

    private Integer id;
    private Integer clientId;
    private String  originZipCode;
    private String  destinationZipCode;
    private String  calculationLog;

    private List<QuoteDeliveryOption> deliveryOptions;
    private List<QuoteVolume>         volumes;

    public Quote () {}

    public Quote (String  originZipCode, String  destinationZipCode, List<QuoteVolume> volumes) {
    	this.originZipCode = originZipCode;
    	this.destinationZipCode = destinationZipCode;
    	this.volumes = volumes;
    }

    public Integer getId() {
        return id;
    }
    public void setId( Integer id ) {
        this.id = id;
    }
    public Integer getClientId() {
        return clientId;
    }
    public void setClientId( Integer clientId ) {
        this.clientId = clientId;
    }
    public String getOriginZipCode() {
        return originZipCode;
    }
    public void setOriginZipCode(String originZipCode) {
        this.originZipCode = originZipCode;
    }
    public String getDestinationZipCode() {
        return destinationZipCode;
    }
    public void setDestinationZipCode(String destinationZipCode) {
        this.destinationZipCode = destinationZipCode;
    }
    public List<QuoteVolume> getVolumes() {
        return volumes;
    }
    public void setVolumes(List<QuoteVolume> volumes) {
        this.volumes = volumes;
    }
    public List<QuoteDeliveryOption> getDeliveryOptions() {
        return deliveryOptions;
    }
    public void setDeliveryOptions( List<QuoteDeliveryOption> deliveryOptions ) {
        this.deliveryOptions = deliveryOptions;
    }
	@Override
    public String toString() {
	    return "Quote [id=" + id + ", clientId=" + clientId
	            + ", originZipCode=" + originZipCode + ", destinationZipCode="
	            + destinationZipCode + ", calculationLog=" + calculationLog
	            + ", deliveryOptions=" + deliveryOptions + ", volumes="
	            + volumes + "]";
    }
}
