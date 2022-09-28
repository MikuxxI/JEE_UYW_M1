package MRUYW.UYW.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import MRUYW.UYW.repo.IRessourceRepository;

@Controller
@RequestMapping("/Ressource")
public class RessourceController {

    /* Accesible uniquement par les admin log via loginController */
    
    @Autowired
    private IRessourceRepository repoRessource;

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("ressource", this.repoRessource.findAll());

        return "Ressource";
    }

}
