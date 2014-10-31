package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class ShipmentOrderVolume {

	 @JsonProperty("shipment_order_volume_id")
	    private Integer id;
	    private String shipmentOrderVolumeNumber;
	    private Integer shipmentOrderId;
	    private ShipmentOrderVolumeState shipmentOrderVolumeState = ShipmentOrderVolumeState.NEW;
	    private Double weight;
	    private String volumeTypeCode;
	    private Double width;
	    private Double height;
	    private Double length;
	    private String productsNature;
	    private Integer productsQuantity;
	    private Boolean isIcmsExempt;
	    @JsonProperty("shipment_order_volume_state_history_array")
	    private List<ShipmentOrderVolumeStateHistory> shipmentOrderVolumeStateHistories = new ArrayList<>();
	    private DateTime created;
	    private DateTime modified;
	    @JsonProperty("logistics_provider_data")
	    private Map<String, String> logisticsProviderData = new HashMap<>();
	    @JsonProperty("tracking_code")
	    private String clientTrackingCode;
	    private String logisticProviderTrackingCode;
	    private LocalDate estimatedDeliveryDateLp;
	    private ShipmentOrderVolumeInvoice shipmentOrderVolumeInvoice;

	    public ShipmentOrderVolume () {}

	    public ShipmentOrderVolume (String shipmentOrderVolumeNumber, Double weight, String volumeTypeCode, Double width, Double height,
	    							Double length, String productsNature, Integer productsQuantity, Boolean isIcmsExempt, String clientTrackingCode,
	    							Map<String, String> logisticsProviderData) {
	    	this.shipmentOrderVolumeNumber = shipmentOrderVolumeNumber;
	    	this.weight = weight;
	    	this.volumeTypeCode = volumeTypeCode;
	    	this.width = width;
	    	this.height = height;
	    	this.length = length;
	    	this.productsNature = productsNature;
	    	this.productsQuantity = productsQuantity;
	    	this.isIcmsExempt = isIcmsExempt;
	    	this.clientTrackingCode = clientTrackingCode;
	    	this.logisticsProviderData = logisticsProviderData;
	    }

		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getShipmentOrderVolumeNumber() {
			return shipmentOrderVolumeNumber;
		}
		public void setShipmentOrderVolumeNumber(String shipmentOrderVolumeNumber) {
			this.shipmentOrderVolumeNumber = shipmentOrderVolumeNumber;
		}
		public Integer getShipmentOrderId() {
			return shipmentOrderId;
		}
		public void setShipmentOrderId(Integer shipmentOrderId) {
			this.shipmentOrderId = shipmentOrderId;
		}
		public ShipmentOrderVolumeState getShipmentOrderVolumeState() {
			return shipmentOrderVolumeState;
		}
		public void setShipmentOrderVolumeState(
		        ShipmentOrderVolumeState shipmentOrderVolumeState) {
			this.shipmentOrderVolumeState = shipmentOrderVolumeState;
		}
		public Double getWeight() {
			return weight;
		}
		public void setWeight(Double weight) {
			this.weight = weight;
		}
		public String getVolumeTypeCode() {
			return volumeTypeCode;
		}
		public void setVolumeTypeCode(String volumeTypeCode) {
			this.volumeTypeCode = volumeTypeCode;
		}
		public Double getWidth() {
			return width;
		}
		public void setWidth(Double width) {
			this.width = width;
		}
		public Double getHeight() {
			return height;
		}
		public void setHeight(Double height) {
			this.height = height;
		}
		public Double getLength() {
			return length;
		}
		public void setLength(Double length) {
			this.length = length;
		}
		public String getProductsNature() {
			return productsNature;
		}
		public void setProductsNature(String productsNature) {
			this.productsNature = productsNature;
		}
		public Integer getProductsQuantity() {
			return productsQuantity;
		}
		public void setProductsQuantity(Integer productsQuantity) {
			this.productsQuantity = productsQuantity;
		}
		public Boolean getIsIcmsExempt() {
			return isIcmsExempt;
		}
		public void setIsIcmsExempt(Boolean isIcmsExempt) {
			this.isIcmsExempt = isIcmsExempt;
		}
		public List<ShipmentOrderVolumeStateHistory> getShipmentOrderVolumeStateHistories() {
			return shipmentOrderVolumeStateHistories;
		}
		public void setShipmentOrderVolumeStateHistories(
		        List<ShipmentOrderVolumeStateHistory> shipmentOrderVolumeStateHistories) {
			this.shipmentOrderVolumeStateHistories = shipmentOrderVolumeStateHistories;
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
		public Map<String, String> getLogisticsProviderData() {
			return logisticsProviderData;
		}
		public void setLogisticsProviderData(Map<String, String> logisticsProviderData) {
			this.logisticsProviderData = logisticsProviderData;
		}
		public String getClientTrackingCode() {
			return clientTrackingCode;
		}
		public void setClientTrackingCode(String clientTrackingCode) {
			this.clientTrackingCode = clientTrackingCode;
		}
		public String getLogisticProviderTrackingCode() {
			return logisticProviderTrackingCode;
		}
		public void setLogisticProviderTrackingCode(String logisticProviderTrackingCode) {
			this.logisticProviderTrackingCode = logisticProviderTrackingCode;
		}
		public LocalDate getEstimatedDeliveryDateLp() {
			return estimatedDeliveryDateLp;
		}
		public void setEstimatedDeliveryDateLp(LocalDate estimatedDeliveryDateLp) {
			this.estimatedDeliveryDateLp = estimatedDeliveryDateLp;
		}
		public ShipmentOrderVolumeInvoice getShipmentOrderVolumeInvoice() {
			return shipmentOrderVolumeInvoice;
		}
		public void setShipmentOrderVolumeInvoice(
		        ShipmentOrderVolumeInvoice shipmentOrderVolumeInvoice) {
			this.shipmentOrderVolumeInvoice = shipmentOrderVolumeInvoice;
		}

		@Override
        public String toString() {
	        return "ShipmentOrderVolume [id=" + id
	                + ", shipmentOrderVolumeNumber="
	                + shipmentOrderVolumeNumber + ", shipmentOrderId="
	                + shipmentOrderId + ", shipmentOrderVolumeState="
	                + shipmentOrderVolumeState + ", weight=" + weight
	                + ", volumeTypeCode=" + volumeTypeCode + ", width=" + width
	                + ", height=" + height + ", length=" + length
	                + ", productsNature=" + productsNature
	                + ", productsQuantity=" + productsQuantity
	                + ", isIcmsExempt=" + isIcmsExempt
	                + ", shipmentOrderVolumeStateHistories="
	                + shipmentOrderVolumeStateHistories + ", created="
	                + created + ", modified=" + modified
	                + ", logisticsProviderData=" + logisticsProviderData
	                + ", clientTrackingCode=" + clientTrackingCode
	                + ", logisticProviderTrackingCode="
	                + logisticProviderTrackingCode
	                + ", estimatedDeliveryDateLp=" + estimatedDeliveryDateLp
	                + ", shipmentOrderVolumeInvoice="
	                + shipmentOrderVolumeInvoice + "]";
        }
}
