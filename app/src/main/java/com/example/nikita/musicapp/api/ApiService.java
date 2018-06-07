package com.example.nikita.musicapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    public static ApiClient getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.theaudiodb.com/api/v1/json/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiClient.class);
    }

}
