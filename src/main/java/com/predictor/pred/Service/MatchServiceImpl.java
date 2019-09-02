package com.predictor.pred.Service;

import com.predictor.pred.Model.MatchResponse;
import com.predictor.pred.Retrofit2.RetrofitClient;
import com.predictor.pred.Retrofit2.RetrofitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Service
public class MatchServiceImpl implements MatchService {

  private RetrofitClient retrofitClient;

  @Autowired
  RetrofitService retrofitService;

  @Override
  public void listTodaysMatches() {
    retrofitClient = retrofitService.getRetrofitClient();
    retrofitClient.getTodaysMatches()
        .enqueue(new Callback<>() {
          @Override
          public void onResponse(Call<MatchResponse> call, Response<MatchResponse> response) {
            for (int i = response.body().getMatches().length - 1; i >= 0; i--) {
              System.out.println(
                  response.body().getMatches()[i].getHomeTeam().getName() + " vs. " +
                  response.body().getMatches()[i].getAwayTeam().getName());
            }
          }

          @Override
          public void onFailure(Call<MatchResponse> call, Throwable t) {
            t.printStackTrace();
          }
        });
  }
}
