package com.example.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class APIClientHelper {

    public static final String BASEURL = "https://reqres.in/api/";

    public static Retrofit retrofit = null;

    static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit;
    }


}
