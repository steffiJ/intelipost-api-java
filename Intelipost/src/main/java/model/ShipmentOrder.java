package model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;


public class ShipmentOrder {

    private Integer id;
    private Integer clientId;
    private Integer quoteId;
    private Integer deliveryMethodId;
    private Double providerShippingCosts;
    private Double customerShippingCosts;
    private String orderNumber;
    private LocalDate estimatedDeliveryDate;
    private LocalDate platformEstimatedDeliveryDate;

	private DateTime created;
    private DateTime modified;
    private EndCustomer endCustomer;
    @JsonProperty("shipment_order_volume_array")
    private List<ShipmentOrderVolume> shipmentOrderVolumes = new ArrayList<>();

    public ShipmentOrder () {}

    public ShipmentOrder (Integer quoteId, Integer deliveryMethodId, Double providerShippingCosts, Double customerShippingCosts,
    						String orderNumber, LocalDate estimatedDeliveryDate, EndCustomer endCustomer, List<ShipmentOrderVolume> shipmentOrderVolumes) {
    	this.quoteId = quoteId;
    	this.deliveryMethodId = deliveryMethodId;
    	this.providerShippingCosts = providerShippingCosts;
    	this.customerShippingCosts = customerShippingCosts;
    	this.orderNumber = orderNumber;
    	this.estimatedDeliveryDate = estimatedDeliveryDate;
    	this.endCustomer = endCustomer;
    	this.shipmentOrderVolumes = shipmentOrderVolumes;

    }

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public Integer getDeliveryMethodId() {
		return deliveryMethodId;
	}
	public void setDeliveryMethodId(Integer deliveryMethodId) {
		this.deliveryMethodId = deliveryMethodId;
	}
	public Double getProviderShippingCosts() {
		return providerShippingCosts;
	}
	public void setProviderShippingCosts(Double providerShippingCosts) {
		this.providerShippingCosts = providerShippingCosts;
	}
	public Double getCustomerShippingCosts() {
		return customerShippingCosts;
	}
	public void setCustomerShippingCosts(Double customerShippingCosts) {
		this.customerShippingCosts = customerShippingCosts;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public LocalDate getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}
	public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}
	public LocalDate getPlatformEstimatedDeliveryDate() {
		return platformEstimatedDeliveryDate;
	}
	public void setPlatformEstimatedDeliveryDate(
	        LocalDate platformEstimatedDeliveryDate) {
		this.platformEstimatedDeliveryDate = platformEstimatedDeliveryDate;
	}
	public DateTime getCreated() {
		return created;
	}
	public void setCreated(DateTime created) {
		this.created = created;
	}
	public DateTime getModified() {
		return modified;
	}
	public void setModified(DateTime modified) {
		this.modified = modified;
	}
	public EndCustomer getEndCustomer() {
		return endCustomer;
	}
	public void setEndCustomer(EndCustomer endCustomer) {
		this.endCustomer = endCustomer;
	}
	public List<ShipmentOrderVolume> getShipmentOrderVolumes() {
		return shipmentOrderVolumes;
	}
	public void setShipmentOrderVolumes(
	        List<ShipmentOrderVolume> shipmentOrderVolumes) {
		this.shipmentOrderVolumes = shipmentOrderVolumes;
	}
	@Override
    public String toString() {
	    return "ShipmentOrder [id=" + id + ", clientId=" + clientId
	            + ", quoteId=" + quoteId + ", deliveryMethodId="
	            + deliveryMethodId + ", providerShippingCosts="
	            + providerShippingCosts + ", customerShippingCosts="
	            + customerShippingCosts + ", orderNumber=" + orderNumber
	            + ", estimatedDeliveryDate=" + estimatedDeliveryDate
	            + ", platformEstimatedDeliveryDate="
	            + platformEstimatedDeliveryDate + ", created=" + created
	            + ", modified=" + modified + ", endCustomer=" + endCustomer
	            + ", shipmentOrderVolumes=" + shipmentOrderVolumes + "]";
    }
}
