package com.explore.response_wrapper.entity;

public class RestResponse<T> {

    private MetaData metaData;
    private T data;

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
