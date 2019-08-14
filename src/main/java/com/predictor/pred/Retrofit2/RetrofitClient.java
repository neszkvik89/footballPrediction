package com.predictor.pred.Retrofit2;

import com.predictor.pred.Model.FootballTeam;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface RetrofitClient {

  @Headers("X-RapidAPI-Key: ac0cdd23f9msh74a94a30a2c9a99p154b40jsn9ec568a1c6e5")
  @GET("teams/team/23")
  Call<FootballTeam> getTeamDetails();


}
