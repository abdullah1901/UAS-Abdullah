package com.abdullah.tvshowsbyabdullah.viewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.abdullah.tvshowsbyabdullah.repositories.SearchTVShowRepository;
import com.abdullah.tvshowsbyabdullah.responses.TVShowsResponse;

public class SearchViewModel extends ViewModel {

    private SearchTVShowRepository searchTVShowRepository;

    public SearchViewModel(){
        searchTVShowRepository = new SearchTVShowRepository();
    }

    public LiveData<TVShowsResponse> searchTVShow(String query, int page){
        return searchTVShowRepository.searchTVShow(query,page);
    }

}
