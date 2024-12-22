package com.explore.response_wrapper.entity;

public class MetaData {
    private Boolean success;
    private String display_message_code;
    private String correlation_id;

    public MetaData(Boolean success, String display_message_code, String correlation_id) {
        this.success = success;
        this.display_message_code = display_message_code;
        this.correlation_id = correlation_id;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDisplay_message_code() {
        return display_message_code;
    }

    public void setDisplay_message_code(String display_message_code) {
        this.display_message_code = display_message_code;
    }

    public String getCorrelation_id() {
        return correlation_id;
    }

    public void setCorrelation_id(String correlation_id) {
        this.correlation_id = correlation_id;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "success='" + success + '\'' +
                ", display='" + display_message_code + '\'' +
                ", correlation='" + correlation_id + '\'' +
                '}';
    }
}
