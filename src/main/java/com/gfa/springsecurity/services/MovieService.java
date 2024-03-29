package com.gfa.springsecurity.services;


import com.gfa.springsecurity.models.Movie;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

import java.io.IOException;
import java.util.List;


public interface MovieService {
    @GET("search/movie")
    Call<Object> discoverMovies(@Header("Authorization") String authorization,
                                @Query("query") String Search);

    Object getListOfMoviesAndSave(String query) throws IOException;

    List<Movie> getMovies();

    List<Movie> getMoviesBySearch(String search);
}
