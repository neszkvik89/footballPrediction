package com.predictor.pred.Retrofit2;

import com.predictor.pred.ResponseModels.MatchResponse;
import com.predictor.pred.Model.Player;
import com.predictor.pred.ResponseModels.ScorersResponse;
import com.predictor.pred.ResponseModels.StandingsResponse;
import com.predictor.pred.Model.Team;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface RetrofitClient {

  @Headers("X-Auth-Token: fdd07844c7ac4b5a8f0011b1bca46fa5")
  @GET("players/{playerId}")
  Call<Player> getPlayerDetails(@Path("playerId") int playerId);

  @Headers("X-Auth-Token: fdd07844c7ac4b5a8f0011b1bca46fa5")
  @GET("teams/{teamId}")
  Call<Team> getTeamDetails(@Path("teamId") int teamId);

  @Headers("X-Auth-Token: fdd07844c7ac4b5a8f0011b1bca46fa5")
  @GET("competitions/{competitionId}/standings")
  Call<StandingsResponse> getLeagueStandings(@Path("competitionId") int competitionId);

  @Headers("X-Auth-Token: fdd07844c7ac4b5a8f0011b1bca46fa5")
  @GET("matches")
  Call<MatchResponse> getTodaysMatches();


  @Headers("X-Auth-Token: fdd07844c7ac4b5a8f0011b1bca46fa5")
  @GET("competitions/{competitionId}/scorers")
  Call<ScorersResponse> getScorers(@Path("competitionId") int competitionId);

}
