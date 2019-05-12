package com.nansty.netevent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LolMatch {

    @SerializedName("winner_id")
    @Expose
    private Integer winner_id;
    @SerializedName("tournament_id")
    @Expose
    private Integer tournament_id;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("number_of_games")
    @Expose
    private Integer number_of_games;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("modified_at")
    @Expose
    private String modified_at;
    @SerializedName("match_type")
    @Expose
    private String match_type;
    @SerializedName("live")
    @Expose
    private Live live;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("draw")
    @Expose
    private Boolean draw;
    @SerializedName("begin_at")
    @Expose
    private String begin_at;

    public Integer getWinner_id() {
        return winner_id;
    }

    public void setWinner_id(Integer winner_id) {
        this.winner_id = winner_id;
    }

    public Integer getTournament_id() {
        return tournament_id;
    }

    public void setTournament_id(Integer tournament_id) {
        this.tournament_id = tournament_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getNumber_of_games() {
        return number_of_games;
    }

    public void setNumber_of_games(Integer number_of_games) {
        this.number_of_games = number_of_games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModified_at() {
        return modified_at;
    }

    public void setModified_at(String modified_at) {
        this.modified_at = modified_at;
    }

    public String getMatch_type() {
        return match_type;
    }

    public void setMatch_type(String match_type) {
        this.match_type = match_type;
    }

    public Live getLive() {
        return live;
    }

    public void setLive(Live live) {
        this.live = live;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDraw() {
        return draw;
    }

    public void setDraw(Boolean draw) {
        this.draw = draw;
    }

    public String getBegin_at() {
        return begin_at;
    }

    public void setBegin_at(String begin_at) {
        this.begin_at = begin_at;
    }

}