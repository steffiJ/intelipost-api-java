package model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;


public class ShipmentOrderVolumeStateHistory {

    @JsonProperty("shipment_order_volume_state_history")
    private Integer id;
    private Integer shipmentOrderVolumeId;
    private ShipmentOrderVolumeState shipmentOrderVolumeState;
    private DateTime created;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getShipmentOrderVolumeId() {
		return shipmentOrderVolumeId;
	}
	public void setShipmentOrderVolumeId(Integer shipmentOrderVolumeId) {
		this.shipmentOrderVolumeId = shipmentOrderVolumeId;
	}
	public ShipmentOrderVolumeState getShipmentOrderVolumeState() {
		return shipmentOrderVolumeState;
	}
	public void setShipmentOrderVolumeState(
	        ShipmentOrderVolumeState shipmentOrderVolumeState) {
		this.shipmentOrderVolumeState = shipmentOrderVolumeState;
	}
	public DateTime getCreated() {
		return created;
	}
	public void setCreated(DateTime created) {
		this.created = created;
	}

	@Override
    public String toString() {
	    return "ShipmentOrderVolumeStateHistory [id=" + id
	            + ", shipmentOrderVolumeId=" + shipmentOrderVolumeId
	            + ", shipmentOrderVolumeState=" + shipmentOrderVolumeState
	            + ", created=" + created + "]";
    }
}
