package com.predictor.pred.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Match {

  private int id;
  private String status;
  private int attendance;
  private String venue;
  private Team homeTeam;
  private Team awayTeam;

}
