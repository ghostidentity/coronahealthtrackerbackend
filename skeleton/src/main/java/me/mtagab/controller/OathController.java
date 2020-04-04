package me.mtagab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OathController {

    @RequestMapping(name = "/api/auth", method = RequestMethod.GET)
    public ModelAndView redirection1(ModelMap model) {
        //return new ResponseEntity<>("Received response from auth server1", HttpStatus.ACCEPTED);

        model.addAttribute("attribute", "redirectWithRedirectPrefix");
        return new ModelAndView("redirect:/main", model);
    }

    @RequestMapping(name = "/api/auth", method = RequestMethod.POST)
    public ResponseEntity<String>  redirection2() {
        return new ResponseEntity<>("Received response from auth server2", HttpStatus.ACCEPTED);
    }
}
