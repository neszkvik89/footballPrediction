package com.predictor.pred.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TableTeam {

  private int position;
  private Team team;
  private int playedGames;
  private int won;
  private int draw;
  private int lost;
  private int points;
  private int goalsFor;
  private int goalsAgainst;
  private int goalDifference;

}
