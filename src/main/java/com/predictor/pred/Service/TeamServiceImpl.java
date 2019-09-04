package com.predictor.pred.Service;

import com.predictor.pred.Model.Team;
import com.predictor.pred.Retrofit2.RetrofitClient;
import com.predictor.pred.Retrofit2.RetrofitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Service
public class TeamServiceImpl implements TeamService {

  private RetrofitClient retrofitClient;

  @Autowired
  RetrofitService retrofitService;

  @Override
  public String getTeamName(int teamId) {
    final String[] teamName = {""};
    retrofitClient = retrofitService.getRetrofitClient();
    retrofitClient.getTeamDetails(teamId)
        .enqueue(new Callback<>() {
          @Override
          public void onResponse(Call<Team> call, Response<Team> response) {
            teamName[0] = response.body().getName();
            System.out.println(teamName[0]);
          }

          @Override
          public void onFailure(Call<Team> call, Throwable t) {
            t.printStackTrace();
          }
        });

    return teamName[0];
  }
}
