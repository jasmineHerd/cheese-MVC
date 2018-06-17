package com.example.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;

@Controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request){

        String name = request.getParameter("name");
        return "Hello" + name;
    }
    @RequestMapping(value = "goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye";
    }
}
