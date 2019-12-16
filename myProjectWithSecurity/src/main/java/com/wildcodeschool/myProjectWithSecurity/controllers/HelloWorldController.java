package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secretBase() {
        return "    Biarritz\n" +
                "    Bordeaux\n" +
                "    La Loupe\n" +
                "    Lille\n" +
                "    Lyon\n" +
                "    Marseille\n" +
                "    Nantes\n" +
                "    Orléans\n" +
                "    Paris\n" +
                "    Reims\n" +
                "    Strasbourg\n" +
                "    Toulouse\n" +
                "    Tours\n" +
                "\n" +
                "Europe\n" +
                "\n" +
                "    Amsterdam\n" +
                "    Barcelone\n" +
                "    Berlin\n" +
                "    Bruxelles\n" +
                "    Bucarest\n" +
                "    Budapest\n" +
                "    Dublin\n" +
                "    Lisbonne\n" +
                "    Londres\n" +
                "    Madrid\n" +
                "    Milan";
    }

}
