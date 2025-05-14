package com.example.mymovies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rating implements Serializable {
    @SerializedName("kp")
    private String kp;

    @Override
    public String toString() {
        return "Rating{" +
                "kp='" + kp + '\'' +
                '}';
    }

    public String getKp() {
        return kp;
    }

    public Rating(String kp) {
        this.kp = kp;
    }
}
