package com.example.cheesemvc.controllers;

import com.example.cheesemvc.models.Cheese;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "cheese")
public class CheeseController {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    @RequestMapping(value ="" )
    public String index(Model model) {

        model.addAttribute("cheeses",cheeses);
        model.addAttribute("title","My Cheeses");
        return "cheese/index";
    }
    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model) {
        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "Remove Cheese");
        return "cheese/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam ArrayList<String> cheese) {

        for (String aCheese : cheese) {
            cheeses.remove(aCheese);
        }

        return "redirect:";
    }


    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String desplayAddCheeseForm(Model model){
        model.addAttribute("title","Add Cheese");
        return "cheese/add";

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@RequestParam String cheeseName, @RequestParam String cheeseDescription){
            Cheese newCheese = new Cheese(cheeseName,cheeseDescription);
            cheeses.add(newCheese);
            return "redirect:";
        }

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

