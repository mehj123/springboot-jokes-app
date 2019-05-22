package com.learningspring5.springbootjokesapp.controller;

import com.learningspring5.springbootjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Controller
public class SpringJokesController {


    private JokeService jokeService;

    public SpringJokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getJokeFromJar(Model model){
        model.addAttribute("jokeString", jokeService.getJoke());
        return "chuck-norris";
    }
}
