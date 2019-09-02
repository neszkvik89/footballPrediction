package com.predictor.pred.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class PlayerResponse {
  private int id;
  private String name;
  private String firstName;
  private String lastName;
  private String dateOfBirth;
  private String countryOfBirth;
  private String nationality;
  private String position;
  private String lastUpdated;
}
