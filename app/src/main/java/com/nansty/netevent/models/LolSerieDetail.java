package com.nansty.netevent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LolSerieDetail {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("season")
    @Expose
    private Object season;
    @SerializedName("begin_at")
    @Expose
    private String beginAt;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("winner_id")
    @Expose
    private Object winnerId;
    @SerializedName("winner_type")
    @Expose
    private Object winnerType;
    @SerializedName("end_at")
    @Expose
    private Object endAt;
    @SerializedName("full_name")
    @Expose
    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Object getSeason() {
        return season;
    }

    public void setSeason(Object season) {
        this.season = season;
    }

    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Object getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Object winnerId) {
        this.winnerId = winnerId;
    }

    public Object getWinnerType() {
        return winnerType;
    }

    public void setWinnerType(Object winnerType) {
        this.winnerType = winnerType;
    }

    public Object getEndAt() {
        return endAt;
    }

    public void setEndAt(Object endAt) {
        this.endAt = endAt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}