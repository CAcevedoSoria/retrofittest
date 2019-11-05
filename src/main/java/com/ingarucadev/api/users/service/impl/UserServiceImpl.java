package com.ingarucadev.api.users.service.impl;

import com.ingarucadev.api.users.model.api.UserDTOResponse;
import com.ingarucadev.api.users.proxy.UserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;

@Service
public class UserServiceImpl  {

  @Autowired
  private UserProxy userProxy;

  public List<UserDTOResponse> findAll() throws Exception{
    Call<List<UserDTOResponse>> playlist = userProxy.findAll();
    return playlist.execute().body();
  }

  public UserDTOResponse getUser(String id) throws IOException {
    Call<UserDTOResponse> playlistCall = userProxy.getUser(id);
    return playlistCall.execute().body();
  }



/*
  @Override
  public UserDTOResponse getUser(long id) throws IOException {
    UserDTOResponse response = new UserDTOResponse();
    Response<UserApiResponse> userApiResponse = userProxy.getUser(id).execute();
    UserApi userApi = userApiResponse.body().getData();

    response.setId(id);
    response.setFullName(userApi.getFirst_name().concat(" ").concat(userApi.getLast_name()));
    response.setEmail(userApi.getEmail());
    return response;


 */



  }


