package com.predictor.pred.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Goal {

  private int minute;
  private Team team;
  private Player scorer;
  private Player assist;
}
