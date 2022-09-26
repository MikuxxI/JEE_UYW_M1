package mr_uyw.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // On demande a  SPRING de la manager en tant que Controller Web
public class HomeController {
//    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @GetMapping("/home")
    public String welcome(HttpSession session) {
//        if (session.getAttribute("utilisateurSession") == null) {
//            return "redirect:/login";
//        }
        
        return "home";
//        return "/WEB-INF/views/home.jsp";
    }
    
}