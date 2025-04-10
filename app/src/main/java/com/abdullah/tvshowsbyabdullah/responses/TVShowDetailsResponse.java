package com.abdullah.tvshowsbyabdullah.responses;

import com.google.gson.annotations.SerializedName;

import com.abdullah.tvshowsbyabdullah.models.TVShowDetails;

public class TVShowDetailsResponse {

    @SerializedName("tvShow")
    private TVShowDetails tvShowDetails;

    public TVShowDetails getTvShowDetails() {
        return tvShowDetails;
    }
}
