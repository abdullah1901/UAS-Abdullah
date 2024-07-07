package com.abdullah.tvshowsbyabdullah.listeners;

import com.abdullah.tvshowsbyabdullah.models.TVShow;

public interface WatchlistListener {

    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist(TVShow tvShow, int position);

}
