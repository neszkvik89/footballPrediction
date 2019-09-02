package com.predictor.pred.ResponseModels;

import com.predictor.pred.Model.Standings;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StandingsResponse {

  private Standings[] standings;
}
