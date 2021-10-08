package com.example.retrofit;

import com.example.retrofit.pojo.CreateUserRequest;
import com.example.retrofit.pojo.CreateUserResponse;
import com.example.retrofit.pojo.User;
import retrofit2.Call;
import retrofit2.http.*;

public interface APIInterface {
    @GET("users/2")
    Call<User> getUser();

    @POST("users")
    Call<CreateUserResponse> createUser(@Body CreateUserRequest body);

}
