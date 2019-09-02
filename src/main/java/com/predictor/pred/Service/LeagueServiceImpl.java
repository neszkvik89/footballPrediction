package com.predictor.pred.Service;

import com.predictor.pred.ResponseModels.StandingsResponse;
import com.predictor.pred.Retrofit2.RetrofitClient;
import com.predictor.pred.Retrofit2.RetrofitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Service
public class LeagueServiceImpl implements LeagueService {

  private RetrofitClient retrofitClient;

  @Autowired
  RetrofitService retrofitService;

  @Override
  public void getStandings(int leagueId) {
    retrofitClient = retrofitService.getRetrofitClient();
    retrofitClient.getLeagueStandings(leagueId)
        .enqueue(new Callback<>() {
          @Override
          public void onResponse(Call<StandingsResponse> call, Response<StandingsResponse> response) {
            for (int i = 0; i < 20; i++) {
              System.out.println(response.body().getStandings()[0].getTable()[i].getTeam().getName());
            }
          }

          @Override
          public void onFailure(Call<StandingsResponse> call, Throwable t) {
            t.printStackTrace();
          }
        });
  }
}
