package com.example.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
//add base requestmapping value = /cheese
@RequestMapping("cheese")
public class CheeseController {
    static HashMap<String,String>cheeses = new HashMap<>();
    //REQUEST PATH: /cheese
    @RequestMapping(value = "")
    //Get rid of annotation
    // @Requestbody
    public String index(Model model){
        //pass arraylist object cheeses
        model.addAttribute("cheeses",cheeses);
        //return "file name"
        model.addAttribute("title","My Cheeses");
        return "cheese/index";
    }
    @RequestMapping(value = "add", method=RequestMethod.GET)
    public String displayAddCheeseForm(Model model){
        model.addAttribute("title","Add Cheese");
        return "cheese/add";

    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    //RequestParam name MUST MATCH name of form info is coming from
    public String processAddCheeseForm(@RequestParam String cheeseName, @RequestParam String cheeseDescription){
        cheeses.put(cheeseName,cheeseDescription);
        // Redirect to /cheese
        //default redirect to top Controller RequestMapping
        return "redirect: ";
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

