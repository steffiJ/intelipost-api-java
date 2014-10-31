package model;

public class CepLocationAddress {

	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private String stateShort;
	private String ibge;


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStateShort() {
		return stateShort;
	}
	public void setStateShort(String stateShort) {
		this.stateShort = stateShort;
	}
	public String getIbge() {
		return ibge;
	}
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	@Override
    public String toString() {
	    return "CepLocationAddressBody [state=" + state + ", city=" + city
	            + ", neighborhood=" + neighborhood + ", street=" + street
	            + ", stateShort=" + stateShort + ", ibge=" + ibge + "]";
    }
}
