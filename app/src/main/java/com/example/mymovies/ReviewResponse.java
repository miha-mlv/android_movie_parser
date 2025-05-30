package com.example.mymovies;

import com.google.gson.annotations.SerializedName;

import java.security.SecureRandom;
import java.util.List;

public class ReviewResponse {
    @SerializedName("docs")
    private List<Review> reviews;

    public ReviewResponse(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "ReviewResponse{" +
                "reviews=" + reviews +
                '}';
    }
}
