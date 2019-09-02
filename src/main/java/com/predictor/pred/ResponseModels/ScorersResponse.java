package com.predictor.pred.ResponseModels;

import com.predictor.pred.Model.Scorer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ScorersResponse {

  private Scorer[] scorers;
}
