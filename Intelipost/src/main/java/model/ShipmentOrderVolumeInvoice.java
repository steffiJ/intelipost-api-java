package model;

import org.joda.time.DateTime;

public class ShipmentOrderVolumeInvoice {

	private Integer id;
	private String shipmentOrderVolumeNumber;
	private Integer shipmentOrderVolumeId;
	private String invoiceSeries;
	private String invoiceNumber;
	private String invoiceKey;
	private DateTime invoiceDate;
	private Double invoiceTotalValue;
	private Double invoiceProductsValue;
	private String invoiceCfop;
	private DateTime created;
	private DateTime modified;

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
	public Integer getShipmentOrderVolumeId() {
		return shipmentOrderVolumeId;
	}
	public void setShipmentOrderVolumeId(Integer shipmentOrderVolumeId) {
		this.shipmentOrderVolumeId = shipmentOrderVolumeId;
	}
	public String getInvoiceSeries() {
		return invoiceSeries;
	}
	public void setInvoiceSeries(String invoiceSeries) {
		this.invoiceSeries = invoiceSeries;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getInvoiceKey() {
		return invoiceKey;
	}
	public void setInvoiceKey(String invoiceKey) {
		this.invoiceKey = invoiceKey;
	}
	public DateTime getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(DateTime invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Double getInvoiceTotalValue() {
		return invoiceTotalValue;
	}
	public void setInvoiceTotalValue(Double invoiceTotalValue) {
		this.invoiceTotalValue = invoiceTotalValue;
	}
	public Double getInvoiceProductsValue() {
		return invoiceProductsValue;
	}
	public void setInvoiceProductsValue(Double invoiceProductsValue) {
		this.invoiceProductsValue = invoiceProductsValue;
	}
	public String getInvoiceCfop() {
		return invoiceCfop;
	}
	public void setInvoiceCfop(String invoiceCfop) {
		this.invoiceCfop = invoiceCfop;
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
	    return "ShipmentOrderVolumeInvoice [id=" + id
	            + ", shipmentOrderVolumeNumber=" + shipmentOrderVolumeNumber
	            + ", shipmentOrderVolumeId=" + shipmentOrderVolumeId
	            + ", invoiceSeries=" + invoiceSeries + ", invoiceNumber="
	            + invoiceNumber + ", invoiceKey=" + invoiceKey
	            + ", invoiceDate=" + invoiceDate + ", invoiceTotalValue="
	            + invoiceTotalValue + ", invoiceProductsValue="
	            + invoiceProductsValue + ", invoiceCfop=" + invoiceCfop
	            + ", created=" + created + ", modified=" + modified + "]";
    }
}
