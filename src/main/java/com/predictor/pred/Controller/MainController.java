package com.predictor.pred.Controller;

import com.predictor.pred.Service.CompetitionService;
import com.predictor.pred.Service.PlayerService;
import com.predictor.pred.Service.LeagueService;
import com.predictor.pred.Service.MatchService;
import com.predictor.pred.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired
  PlayerService playerService;

  @Autowired
  TeamService teamService;

  @Autowired
  LeagueService leagueService;

  @Autowired
  MatchService matchService;

  @Autowired
  CompetitionService competitionService;

  @GetMapping("/player/{playerId}")
  public void getPlayerNameById(@PathVariable (name = "playerId") int playerid) {
    playerService.getPlayerName(playerid);
  }

  @GetMapping("/team/{teamId}")
  public void getTeamNameById(@PathVariable (name = "teamId") int teamId) {
    teamService.getTeamName(teamId);
  }

  @GetMapping("/standings/{leagueId}")
  public void showStanding(@PathVariable (name = "leagueId") int leagueId) {
    leagueService.getStandings(leagueId);
  }

  @GetMapping("/today")
  public void listTodaysMatches() {
    matchService.listTodaysMatches();
  }

  @GetMapping("/scorers/{leagueId}")
  public void listGoalScorers(@PathVariable (name = "leagueId") int leagueId) {
    competitionService.listScorers(leagueId);
  }

}
