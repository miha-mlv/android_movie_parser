package com.example.mymovies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import io.reactivex.rxjava3.disposables.Disposable;

public class FavouriteMoviesViewModel extends AndroidViewModel {
    private static final String TAG = "FavouriteMoviesViewModel";
    private static MutableLiveData<List<Movie>> movies = new MutableLiveData<>();
    private final MovieDao movieDao;
    public FavouriteMoviesViewModel(@NonNull Application application) {
        super(application);
        movieDao = MovieDatabase.getInstance(application).movieDao();
    }

    public LiveData<List<Movie>> getMovies(){
        return movieDao.getAllFavouriteMovies();
    }


}
