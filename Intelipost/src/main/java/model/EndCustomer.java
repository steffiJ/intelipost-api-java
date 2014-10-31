package model;

public class EndCustomer {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String cellphone;
    private Boolean isCompany = false;
    private String federalTaxPayerId;
    private String stateTaxPayerId;
    private String shippingAddress;
    private String shippingNumber;
    private String shippingAdditional;
    private String shippingReference;
    private String shippingQuarter;
    private String shippingCity;
    private String shippingZipCode;
    private String shippingState;
    private String shippingStateCode;
    private String shippingCountry;


    public EndCustomer () {}

    public EndCustomer (String firstName, String lastName, String email, String phone, String cellphone, String federalTaxPayerId,
    					String stateTaxPayerId, String shippingAddress, String shippingNumber, String shippingAdditional,
    					String shippingReference, String shippingQuarter, String shippingCity, String shippingZipCode,
    					String shippingState, String shippingCountry) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	this.phone = phone;
    	this.cellphone = cellphone;
    	this.federalTaxPayerId = federalTaxPayerId;
    	this.stateTaxPayerId = stateTaxPayerId;
    	this.shippingAddress = shippingAddress;
    	this.shippingNumber = shippingNumber;
    	this.shippingAdditional = shippingAdditional;
    	this.shippingReference = shippingReference;
    	this.shippingQuarter = shippingQuarter;
    	this.shippingCity = shippingCity;
    	this.shippingZipCode = shippingZipCode;
    	this.shippingState = shippingState;
    	this.shippingCountry = shippingCountry;
    }

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public Boolean getIsCompany() {
		return isCompany;
	}
	public void setIsCompany(Boolean isCompany) {
		this.isCompany = isCompany;
	}
	public String getFederalTaxPayerId() {
		return federalTaxPayerId;
	}
	public void setFederalTaxPayerId(String federalTaxPayerId) {
		this.federalTaxPayerId = federalTaxPayerId;
	}
	public String getStateTaxPayerId() {
		return stateTaxPayerId;
	}
	public void setStateTaxPayerId(String stateTaxPayerId) {
		this.stateTaxPayerId = stateTaxPayerId;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getShippingNumber() {
		return shippingNumber;
	}
	public void setShippingNumber(String shippingNumber) {
		this.shippingNumber = shippingNumber;
	}
	public String getShippingAdditional() {
		return shippingAdditional;
	}
	public void setShippingAdditional(String shippingAdditional) {
		this.shippingAdditional = shippingAdditional;
	}
	public String getShippingReference() {
		return shippingReference;
	}
	public void setShippingReference(String shippingReference) {
		this.shippingReference = shippingReference;
	}
	public String getShippingQuarter() {
		return shippingQuarter;
	}
	public void setShippingQuarter(String shippingQuarter) {
		this.shippingQuarter = shippingQuarter;
	}
	public String getShippingCity() {
		return shippingCity;
	}
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}
	public String getShippingZipCode() {
		return shippingZipCode;
	}
	public void setShippingZipCode(String shippingZipCode) {
		this.shippingZipCode = shippingZipCode;
	}
	public String getShippingState() {
		return shippingState;
	}
	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}
	public String getShippingStateCode() {
		return shippingStateCode;
	}
	public void setShippingStateCode(String shippingStateCode) {
		this.shippingStateCode = shippingStateCode;
	}
	public String getShippingCountry() {
		return shippingCountry;
	}
	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	@Override
    public String toString() {
	    return "EndCustomer [ firstName=" + firstName
	            + ", lastName=" + lastName + ", email=" + email + ", phone="
	            + phone + ", cellphone=" + cellphone + ", isCompany="
	            + isCompany + ", federalTaxPayerId=" + federalTaxPayerId
	            + ", stateTaxPayerId=" + stateTaxPayerId + ", shippingAddress="
	            + shippingAddress + ", shippingNumber=" + shippingNumber
	            + ", shippingAdditional=" + shippingAdditional
	            + ", shippingReference=" + shippingReference
	            + ", shippingQuarter=" + shippingQuarter + ", shippingCity="
	            + shippingCity + ", shippingZipCode=" + shippingZipCode
	            + ", shippingState=" + shippingState + ", shippingStateCode="
	            + shippingStateCode + ", shippingCountry=" + shippingCountry
	            + "]";
    }
}
