package MRUYW.UYW.controller;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import MRUYW.UYW.model.Ressource;
import MRUYW.UYW.repo.IRessourceRepository;
import MRUYW.UYW.request.RessourceRequest;

@Controller
@RequestMapping("/ressource")
public class RessourceController {

    /* Accesible uniquement par les admin log via loginController */
    
    private static final String REDIRECT = "redirect:/ressource";
    private static final String GAME_RESSOURCE_PATH = "/gameRessource/";

    private static final String REGEX_VARCHAR_LIMIT = "^.{1,255}$";
    private static final String REGEX_EXT_IMG = "[^\s]+(\\.)(jpg|png|bmp)$";
    private static final String REGEX_EXT_VIDEO = "[^\s]+(\\.)(gif|mp4|avi|flv|mpeg|3gp)$";

    @Autowired
    private IRessourceRepository repoRessource;

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("ressourceList", this.repoRessource.findAll());

        return "ressource";
    }

    @PostMapping("/ajouter")
    public String add(RessourceRequest requestRessource) {
        Ressource ressource = new Ressource();
        
        String type = requestRessource.getType();
        String quest = requestRessource.getQuestion();
        String name =requestRessource.getName();
        
        if (Pattern.matches(REGEX_VARCHAR_LIMIT, quest) == false
            && Pattern.matches(REGEX_EXT_IMG, name) == false
            && Pattern.matches(REGEX_EXT_VIDEO, name) == false) {

            return "redirect:/ressource/ajouter/erreur";
        }

        String uri = GAME_RESSOURCE_PATH;
        uri += type == "IMG"?  "gif/" : "img/";

        ressource.setName( name );
        ressource.setUri( uri );
        ressource.setType( type );
        ressource.setQuestion( quest );        
        this.repoRessource.save( ressource );

        return REDIRECT;
    }

    @GetMapping("/supprimer")
    public String deleteById(@RequestParam int id){
        this.repoRessource.deleteById(id);

        return REDIRECT;
    }


    @GetMapping("/ajouter/erreur")
    public String addError(Model model){
        model.addAttribute("isBadFieldValue", true);
        return REDIRECT;
    }

}
