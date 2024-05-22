package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping
    @ResponseBody
    public String website() {
        return "Welcome to the website!";
    }

    @GetMapping("hi")
    @ResponseBody
    public String hi() {
        return "Hi, Spring!";
    }

    @GetMapping("welcome")
    @ResponseBody
    public String welcomeParam(@RequestParam String user) {
        return "Welcome, " + user + "!";
    }

    @GetMapping("welcome/{user}")
    @ResponseBody
    public String welcomePath(@PathVariable String user) {
        return "Welcome, " + user + "!";
    }

    @GetMapping("form")
    @ResponseBody
    public String welcomeForm() {
        return "<html>" +
                "<body>" +
                "<form action='welcome'>" +
                "<input type='text' name='user'>" +
                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
