package com.predictor.pred.Controller;

import com.predictor.pred.Service.FootballTeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired
  FootballTeamServiceImpl footballTeamService;

  @GetMapping("/")
  public void testConnection() {
    footballTeamService.getTeamInfo(24);
  }
}
