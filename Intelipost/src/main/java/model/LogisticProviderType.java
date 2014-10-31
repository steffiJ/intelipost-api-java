package model;

import java.util.HashMap;
import java.util.Map;

public enum LogisticProviderType {

    CORREIOS(  1, "CORREIOS" ),
    TOTAL(     2, "TOTAL" ),
    LOGGI(     3, "LOGGI" ),
    DIRECTLOG( 4, "DIRECTLOG" ),
    TA(        5, "TA" ),
    ELOHIM(    6, "ELOHIM" ),
    DISSUDES(  7, "DISSUDES" ),
    PLC(       8, "PLC" ),
    ATLAS(     9, "ATLAS" ),
    MANUAL(   10, "MANUAL" ),
    VIALOG(   11, "VIALOG" ),
    JADLOG(   12, "JADLOG" );

    private final Integer id;
    private final String code;

    private static final Map<Integer, LogisticProviderType> ID_MAP = new HashMap<>();
    private static final Map<String, LogisticProviderType> CODE_MAP = new HashMap<>();

    static {
        for (LogisticProviderType type: values()) {
            ID_MAP.put(type.getId(), type);
            CODE_MAP.put(type.getCode(), type);
        }
    }

    private LogisticProviderType(Integer id, String code) {
        this.id = id;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }
    public String getCode() {
        return code;
    }

    public static LogisticProviderType getByCode(String code) {
        return CODE_MAP.get(code.toUpperCase());
    }
    public static LogisticProviderType getById(Integer id) {
        return ID_MAP.get(id);
    }
}
