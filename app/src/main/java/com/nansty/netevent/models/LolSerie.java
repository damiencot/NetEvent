package com.nansty.netevent.models;



import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LolSerie {

    @SerializedName("winner_type")
    @Expose
    private String winner_type;
    @SerializedName("winner_id")
    @Expose
    private Integer winner_id;
    @SerializedName("videogame")
    @Expose
    private VideoGame videogame;
    @SerializedName("teams")
    @Expose
    private List<LolTeam> teams = null;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("serie_id")
    @Expose
    private Integer serie_id;
    @SerializedName("serie")
    @Expose
    private LolSerieDetail serie;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("modified_at")
    @Expose
    private String modified_at;
    @SerializedName("matches")
    @Expose
    private List<LolMatch> matches = null;
    @SerializedName("league_id")
    @Expose
    private Integer league_id;
    @SerializedName("league")
    @Expose
    public League league;

    public class League{

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

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("end_at")
    @Expose
    private String end_at;
    @SerializedName("begin_at")
    @Expose
    private String begin_at;

    public String getWinner_type() {
        return winner_type;
    }

    public void setWinner_type(String winner_type) {
        this.winner_type = winner_type;
    }

    public Integer getWinner_id() {
        return winner_id;
    }

    public void setWinner_id(Integer winner_id) {
        this.winner_id = winner_id;
    }

    public VideoGame getVideogame() {
        return videogame;
    }

    public void setVideogame(VideoGame videogame) {
        this.videogame = videogame;
    }

    public List<LolTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<LolTeam> teams) {
        this.teams = teams;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getSerie_id() {
        return serie_id;
    }

    public void setSerie_id(Integer serie_id) {
        this.serie_id = serie_id;
    }

    public LolSerieDetail getSerie() {
        return serie;
    }

    public void setSerie(LolSerieDetail serie) {
        this.serie = serie;
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

    public List<LolMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<LolMatch> matches) {
        this.matches = matches;
    }

    public Integer getLeague_id() {
        return league_id;
    }

    public void setLeague_id(Integer league_id) {
        this.league_id = league_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnd_at() {
        return end_at;
    }

    public void setEnd_at(String end_at) {
        this.end_at = end_at;
    }

    public String getBegin_at() {
        return begin_at;
    }

    public void setBegin_at(String begin_at) {
        this.begin_at = begin_at;
    }

}