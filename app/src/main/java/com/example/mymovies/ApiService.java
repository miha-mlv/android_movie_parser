package com.example.mymovies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

//    @GET("https://api.kinopoisk.dev/v1.4/movie?token=ZE1B42C-NSH402H-PC5VEHA-HJ7BBYD&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=5")
    @GET("https://api.kinopoisk.dev/v1.4/movie?token=ZE1B42C-NSH402H-PC5VEHA-HJ7BBYD&field=rating.kp&search=4-8&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page")int page);

    @GET("movie/{id}?token=ZE1B42C-NSH402H-PC5VEHA-HJ7BBYD")
    Single<TrailerResponse> loadTrailers(@Path("id") int id);

    @GET("review?token=ZE1B42C-NSH402H-PC5VEHA-HJ7BBYD")
    Single<ReviewResponse> loadReviews(@Query("movieId")int id);
}
