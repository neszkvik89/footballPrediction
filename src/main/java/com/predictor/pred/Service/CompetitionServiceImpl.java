package com.predictor.pred.Service;

import com.predictor.pred.ResponseModels.ScorersResponse;
import com.predictor.pred.Retrofit2.RetrofitClient;
import com.predictor.pred.Retrofit2.RetrofitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Service
public class CompetitionServiceImpl implements CompetitionService {

  private RetrofitClient retrofitClient;

  @Autowired
  RetrofitService retrofitService;

  @Override
  public void listScorers(int leagueId) {
    retrofitClient = retrofitService.getRetrofitClient();
    retrofitClient.getScorers(leagueId)
        .enqueue(new Callback<>() {
          @Override
          public void onResponse(Call<ScorersResponse> call, Response<ScorersResponse> response) {
            for (int i = response.body().getScorers().length - 1; i >= 0; i--) {
              System.out.println(response.body().getScorers()[i].getPlayer().getName());
            }
          }

          @Override
          public void onFailure(Call<ScorersResponse> call, Throwable t) {
            t.printStackTrace();
          }
        });
  }
}
