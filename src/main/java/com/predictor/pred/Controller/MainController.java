package com.predictor.pred.Controller;

import com.predictor.pred.Service.FootballPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired
  FootballPlayerService footballPlayerService;

  @GetMapping("/")
  public void testConnection() {
    footballPlayerService.getPlayerName(43);
  }
}
