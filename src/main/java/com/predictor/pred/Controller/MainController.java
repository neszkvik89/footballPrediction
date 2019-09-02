package com.predictor.pred.Controller;

import com.predictor.pred.Service.FootballPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired
  FootballPlayerService footballPlayerService;

  @GetMapping("/player/{id}")
  public void testConnection(@PathVariable (name = "id") int id) {
    footballPlayerService.getPlayerName(id);
  }
}
