package com.example.cheesemvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "cheese")
public class CheeseController {
    @RequestMapping(value ="" )
    public String index(Model model) {
         model.addAttribute("title","My Cheeses");
        return "cheese/index";
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

