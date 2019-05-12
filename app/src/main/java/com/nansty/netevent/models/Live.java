package com.nansty.netevent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Live {

    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("supported")
    @Expose
    private Boolean supported;
    @SerializedName("opens_at")
    @Expose
    private Object opens_at;

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Boolean getSupported() {
        return supported;
    }

    public void setSupported(Boolean supported) {
        this.supported = supported;
    }

    public Object getOpens_at() {
        return opens_at;
    }

    public void setOpens_at(Object opens_at) {
        this.opens_at = opens_at;
    }

}