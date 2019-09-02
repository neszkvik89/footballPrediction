package com.predictor.pred.Retrofit2;

import com.predictor.pred.Model.PlayerResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface RetrofitClient {

  @Headers("X-Auth-Token: fdd07844c7ac4b5a8f0011b1bca46fa5")
  @GET("players/43")
  Call<PlayerResponse> getPlayerDetails();

}
