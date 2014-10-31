package model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

public class DeliveryMethod {

	  @JsonProperty("delivery_method_id")
	    private Integer id;
	    private Integer logisticProviderId;
	    private DeliveryMethodType deliveryMethodType;
	    private String name;
	    private String description;
	    private boolean isActive;
	    private DateTime created;
	    private DateTime modified;


	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public Integer getLogisticProviderId() {
	        return logisticProviderId;
	    }
	    public void setLogisticProviderId(Integer logisticProviderId) {
	        this.logisticProviderId = logisticProviderId;
	    }
	    public DeliveryMethodType getDeliveryMethodType() {
	        return deliveryMethodType;
	    }
	    public void setDeliveryMethodType(DeliveryMethodType deliveryMethodType) {
	        this.deliveryMethodType = deliveryMethodType;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getDescription() {
	        return description;
	    }
	    public void setDescription(String description) {
	        this.description = description;
	    }
	    public boolean isActive() {
	        return isActive;
	    }
	    public void setActive(boolean isActive) {
	        this.isActive = isActive;
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

		@Override
        public String toString() {
	        return "DeliveryMethod [id=" + id + ", logisticProviderId="
	                + logisticProviderId + ", deliveryMethodType="
	                + deliveryMethodType + ", name=" + name + ", description="
	                + description + ", isActive=" + isActive + ", created="
	                + created + ", modified=" + modified + "]";
        }
}
