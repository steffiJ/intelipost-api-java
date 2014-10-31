package model;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;



public class QuoteVolume {

	  private Integer    id;
	    @JsonProperty("volume_type")
	    private String volumeTypeString;
	    @JsonIgnore
	    private VolumeType volumeType;
	    private Double     weight;              // in kg
	    private Double     costOfGoods;
	    private Double     width;               // in cm
	    private Double     height;              // in cm
	    private Double     length;              // in cm

	    public QuoteVolume() {
	        super();
	    }

	    public QuoteVolume (VolumeType volumeType, Double weight, Double costOfGoods, Double width, Double height, Double length) {
	    	this.volumeTypeString = volumeType.getCode();
	    	this.weight = weight;
	    	this.costOfGoods = costOfGoods;
	    	this.width = width;
	    	this.height = height;
	    	this.length = length;
	    }


	    @JsonIgnore
	    public Integer getId() {
	        return id;
	    }
	    public void setId( Integer id ) {
	        this.id = id;
	    }
	    public VolumeType getVolumeType() {
	        return VolumeType.getByCode(volumeTypeString);
	    }

	    public void setVolumeType(VolumeType volumeType) {
	        if (volumeType == null) {
	            this.volumeTypeString = null;
	        } else {
	            this.volumeTypeString = volumeType.getCode();
	        }
	    }
	    public Double getWeight() {
	        return weight;
	    }
	    public void setWeight( Double weight ) {
	        this.weight = weight;
	    }
	    public Double getCostOfGoods() {
	        return costOfGoods;
	    }
	    public void setCostOfGoods( Double costOfGoods ) {
	        this.costOfGoods = costOfGoods;
	    }
	    public Double getWidth() {
	        return width;
	    }
	    public void setWidth( Double width ) {
	        this.width = width;
	    }
	    public Double getHeight() {
	        return height;
	    }
	    public void setHeight( Double height ) {
	        this.height = height;
	    }
	    public Double getLength() {
	        return length;
	    }
	    public void setLength( Double length ) {
	        this.length = length;
	    }

		@Override
        public String toString() {
	        return "QuoteVolume [id=" + id + ", volumeTypeString="
	                + volumeTypeString + ", volumeType=" + volumeType
	                + ", weight=" + weight + ", costOfGoods=" + costOfGoods
	                + ", width=" + width + ", height=" + height + ", length="
	                + length + "]";
        }
}
