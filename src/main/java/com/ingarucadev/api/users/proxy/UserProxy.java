package com.ingarucadev.api.users.proxy;

import com.ingarucadev.api.users.model.api.UserDTOResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface UserProxy {

  @GET("/api/v1.0/students/{id}")
  Call<UserDTOResponse> getUser(@Path("id") String id);

  @GET("/api/v1.0/students")
  Call<List<UserDTOResponse>>findAll();

}
