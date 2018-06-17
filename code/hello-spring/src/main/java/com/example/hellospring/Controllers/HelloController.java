package com.example.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;

@Controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) {

        String name = request.getParameter("name");
        if (name == null) {
            name = "World";
        }
        return "Hello " + name;
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloForm() {
        String a = "Please enter name and language";

        String html =
                "<form method='post'>" +
                        "<input type='text' name='name' />" +
                        "<select name = 'language'>" +
                        "<option value = 'english'>English</option>" +
                        "<option value = 'spanish'>Spanish</option>" +
                        "<option value = 'french'>French</option>" +
                        "</select>" +
                        "<input type='submit' value='Greet Me!'/>" +
                        "</form>";

        return html;
    }


    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String createMessage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String language = request.getParameter("language");
        switch (language) {
            case "spanish":
                return "Hola " + name;
            case "french":
                return "Bonjour " + name;
            case "english":
                return "Hello " + name;
            default:
                return "choose language please, " + name + "!";
        }

    }

    @RequestMapping(value = "hello/{name}")
    @ResponseBody
    public String helloURLSegment(@PathVariable String name) {
        return "Hello " + name;

    }

    @RequestMapping(value = "goodbye")
    public String goodbye() {

        return "redirect:/";
    }


}

