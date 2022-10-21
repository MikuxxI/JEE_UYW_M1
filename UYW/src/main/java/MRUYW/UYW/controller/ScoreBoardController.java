package MRUYW.UYW.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import MRUYW.UYW.repo.ITeamRepository;


@Controller
public class ScoreBoardController {
    @Autowired
    private ITeamRepository repoTeam;
    
    @GetMapping
    public String findAll(Model model){
        model.addAttribute("PlayerScoreboard", this.repoTeam.findTop20ByIsPlayerIsTrueOrderByScoreDesc());
        model.addAttribute("TeamScoreboard", this.repoTeam.findTop20ByIsPlayerIsFalseOrderByScoreDesc());

        return "home";
    }

}
