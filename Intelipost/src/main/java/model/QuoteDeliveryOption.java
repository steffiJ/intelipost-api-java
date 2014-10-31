package model;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;


public class QuoteDeliveryOption {

	private Integer id;
	private Integer deliveryMethodId;
	private Integer deliveryEstimateBusinessDays;
	private Double providerShippingCost;
	private Double finalShippingCost;
	private String description;

	private transient DeliveryMethod deliveryMethod;

	@JsonProperty
	public String getDescription() {
		return deliveryMethod != null ? deliveryMethod.getName() : null;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDeliveryMethodId() {
		return deliveryMethodId;
	}

	public void setDeliveryMethodId(Integer deliveryMethodId) {
		this.deliveryMethodId = deliveryMethodId;
	}

	public Integer getDeliveryEstimateBusinessDays() {
		return deliveryEstimateBusinessDays;
	}

	public void setDeliveryEstimateBusinessDays(Integer deliveryEstimateBusinessDays) {
		this.deliveryEstimateBusinessDays = deliveryEstimateBusinessDays;
	}

	public Double getProviderShippingCost() {
		return providerShippingCost;
	}

	public void setProviderShippingCost(Double providerShippingCost) {
		this.providerShippingCost = providerShippingCost;
	}

	public Double getFinalShippingCost() {
		return finalShippingCost;
	}

	public void setFinalShippingCost(Double finalShippingCost) {
		this.finalShippingCost = finalShippingCost;
	}

	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	@JsonProperty("logistic_provider_name")
	public String getLogisticProviderName() {
		return deliveryMethod != null && deliveryMethod.getLogisticProviderId() != null ? LogisticProviderType.getById(deliveryMethod.getLogisticProviderId()).getCode() : null;
	}

	@JsonProperty("delivery_method_name")
	public String getDeliverymethodName() {
		return deliveryMethod != null ? deliveryMethod.getName() : null;
	}

	@JsonProperty("delivery_method_type")
	public DeliveryMethodType getDeliveryMethodType() {
		return deliveryMethod != null ? deliveryMethod.getDeliveryMethodType() : null;
	}

	@Override
    public String toString() {
	    return "QuoteDeliveryOption [id=" + id + ", deliveryMethodId="
	            + deliveryMethodId + ", deliveryEstimateBusinessDays="
	            + deliveryEstimateBusinessDays + ", providerShippingCost="
	            + providerShippingCost + ", finalShippingCost="
	            + finalShippingCost + ", description=" + description + "]";
    }
}
