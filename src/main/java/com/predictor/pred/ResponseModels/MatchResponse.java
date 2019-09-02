package com.predictor.pred.ResponseModels;

import com.predictor.pred.Model.Match;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MatchResponse {

  private Match[] matches;
}
