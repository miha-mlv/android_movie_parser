package com.example.mymovies;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FavouriteMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_movies);
        RecyclerView recyclerViewMovies = findViewById(R.id.recyclerViewMovies);
        MoviesAdapter moviesAdapter = new MoviesAdapter();
        recyclerViewMovies.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewMovies.setAdapter(moviesAdapter);
        FavouriteMoviesViewModel viewModel = new ViewModelProvider(this)
                .get(FavouriteMoviesViewModel.class);

        viewModel.getMovies().observe(this, new Observer<List<Movie>>() {
            @Override
            public void onChanged(List<Movie> movies) {
                moviesAdapter.setMovies(movies);
            }
        });

        moviesAdapter.setOnMovieClickListener(new MoviesAdapter.OnMovieClickListener() {
            @Override
            public void onMovieClick(Movie movie) {
                startActivity(MovieDetailActivity.newIntent(
                        FavouriteMoviesActivity.this,
                        movie));
            }
        });
    }

    public static Intent newIntent(Context context){
        return new Intent(context, FavouriteMoviesActivity.class);
    }
}