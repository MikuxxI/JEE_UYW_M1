package MRUYW.UYW.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import MRUYW.UYW.repo.ITeamRepository;

@Controller
@RequestMapping("/")
public class ScoreBoardController {

    @Autowired
    private ITeamRepository repoTeam;
    
    @GetMapping
    public String findAll(Model model){
        model.addAttribute("playerScoreboard", this.repoTeam.findTop20ByIsPlayerIsTrueOrderByScoreDesc());
        model.addAttribute("TeamScoreboard", this.repoTeam.findTop20ByIsPlayerIsFalseOrderByScoreDesc());

        return "Ressource";
    }

}
