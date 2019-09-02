package com.predictor.pred.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Result {

  private String winner;
  private Score fullTime;
  private Score halfTime;
  private Score extraTime;
  private Score penalties;
}
