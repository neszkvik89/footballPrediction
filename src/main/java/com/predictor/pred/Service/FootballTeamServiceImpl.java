package com.predictor.pred.Service;

import com.predictor.pred.Model.FootballTeam;
import com.predictor.pred.Retrofit2.RetrofitClient;
import com.predictor.pred.Retrofit2.RetrofitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Service
public class FootballTeamServiceImpl implements FootballTeamService {

  private RetrofitClient retrofitClient;

  @Autowired
  RetrofitService retrofitService;

  @Override
  public void getTeamInfo(int team_id) {
    retrofitClient = retrofitService.getRetrofitClient();
    retrofitClient.getTeamDetails()
        .enqueue(new Callback<>() {
          @Override
          public void onResponse(Call<FootballTeam> call, Response<FootballTeam> response) {
            System.out.println(response.body().getName());
            System.out.println(response.raw().toString());
            System.out.println(response.body().getVenue_name());
          }

          @Override
          public void onFailure(Call<FootballTeam> call, Throwable t) {
            t.printStackTrace();
          }
        });
  }
  }

