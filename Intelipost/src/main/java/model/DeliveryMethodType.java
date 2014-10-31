package model;

import java.util.HashMap;
import java.util.Map;

public enum DeliveryMethodType {

	  STANDARD( 1 , "STANDARD"),
	    EXPRESS( 2, "EXPRESS" ),
	    PRIORITY( 3, "PRIORITY");
	    // more...


	    private static final Map<Integer, DeliveryMethodType> ID_MAP = new HashMap<>();
	    private static final Map<String, DeliveryMethodType> CODE_MAP = new HashMap<>();

	    static {
	        for (DeliveryMethodType type: values()) {
	        	ID_MAP.put(type.getId(), type);
	        	CODE_MAP.put(type.getCode(), type);
	        }
	    }
	    private final Integer id;
	    private final String code;

	    private DeliveryMethodType(Integer id, String code) {
	        this.id = id;
	        this.code = code;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public String getCode() {
	    	return code;
	    }

		public static DeliveryMethodType getById(Integer id) {
			return ID_MAP.get(id);
		}

		public static DeliveryMethodType getByCode(String code) {
			if (code == null) {
				return null;
			}
			return CODE_MAP.get(code.toUpperCase());
		}
}
