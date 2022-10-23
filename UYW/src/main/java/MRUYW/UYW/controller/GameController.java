package MRUYW.UYW.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import MRUYW.UYW.model.Team;
import MRUYW.UYW.repo.IGameRepository;

@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    private IGameRepository repoGame;

    @GetMapping
    public String config(){
        return "configGame";
    }

    @PostMapping
	public String config(Model model, @RequestParam Boolean isPlayer, @RequestParam Integer numberPlayerOrTeam, @RequestParam ArrayList<String> player) {
        List<Team> teams = new ArrayList<Team>(numberPlayerOrTeam);

        for (String name : player) {
            Team team = new Team();
            team.setName(name);
            team.setScore(0);
            team.setPlayer(isPlayer);

            teams.add(team);
        }

        model.addAttribute("PlayerScoreboard", this.repoGame.findAll());
        model.addAttribute("Teams",teams);

        return "game";
	}
    
}
