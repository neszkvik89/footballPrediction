package com.predictor.pred.Service;

import com.predictor.pred.Model.Player;
import com.predictor.pred.Retrofit2.RetrofitClient;
import com.predictor.pred.Retrofit2.RetrofitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Service
public class PlayerServiceImpl implements PlayerService {

  private RetrofitClient retrofitClient;

  @Autowired
  RetrofitService retrofitService;

  @Override
  public void getPlayerName(int playerId) {
    retrofitClient = retrofitService.getRetrofitClient();
    retrofitClient.getPlayerDetails(playerId)
        .enqueue(new Callback<>() {
          @Override
          public void onResponse(Call<Player> call, Response<Player> response) {
            System.out.println(response.body().getName());
          }

          @Override
          public void onFailure(Call<Player> call, Throwable t) {
            t.printStackTrace();
          }
        });
  }
}
