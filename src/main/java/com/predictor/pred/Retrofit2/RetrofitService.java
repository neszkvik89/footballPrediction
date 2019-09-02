package com.predictor.pred.Retrofit2;

import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class RetrofitService {

  private static String apiUrl = "https://api.football-data.org/v2/";

  private Retrofit connectToFootballApi() {
    return new Retrofit
        .Builder()
        .baseUrl(apiUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
  }

  public RetrofitClient getRetrofitClient() {
    return connectToFootballApi().create(RetrofitClient.class);
  }
}
