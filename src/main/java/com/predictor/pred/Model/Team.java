package com.predictor.pred.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Team {

  private int id;
  private String name;
  private String website;
  private int founded;
  private String venue;
  private Player[] squad;
  private Player captain;
  private Player[] lineUp;
  private Player[] bench;
}
