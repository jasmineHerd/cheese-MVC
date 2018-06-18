package com.example.cheesemvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
@RequestMapping(value = "cheese")
public class CheeseController {

    static ArrayList<String> cheeses = new ArrayList<>();

    @RequestMapping(value ="" )
    public String index(Model model) {

        model.addAttribute("cheeses",cheeses);
        model.addAttribute("title","My Cheeses");
        return "cheese/index";
    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String desplayAddCheeseForm(Model model){
        model.addAttribute("title","Add Cheese");
        return "cheese/add";

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@RequestParam String cheeseName){
        cheeses.add(cheeseName);
        return "redirect:";
    }
}
















 /*IN CLASS EXERCISE
    static HashMap<String,String>cheese = new HashMap<>();
            //put this in add form
                <input type = "text" name = "cheese Description"
            //change {cheese} list iterator in view
                {cheese.key +  cheese ' - ' +cheese.value}
            //add to processAddCheeseForm @RequestParam->cheeseDescription
            cheeses.put(CheeseName, cheeseDescription
           */

