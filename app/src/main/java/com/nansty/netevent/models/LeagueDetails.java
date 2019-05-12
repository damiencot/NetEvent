package com.nansty.netevent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.nansty.netevent.models.LolSerie;

public class LeagueDetails extends LolSerie {

    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("modified_at")
    @Expose
    private Object modifiedAt;
    @SerializedName("live_supported")
    @Expose
    private Boolean liveSupported;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("id")
    @Expose
    private Integer id;

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Object modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Boolean getLiveSupported() {
        return liveSupported;
    }

    public void setLiveSupported(Boolean liveSupported) {
        this.liveSupported = liveSupported;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}