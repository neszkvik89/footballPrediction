package com.predictor.pred.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FootballTeam {

  private String name;
  private String country;
  private String venue_name;
  private int venue_capacity;
}
