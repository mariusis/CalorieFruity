package com.goat.CalorieFruity.controllers;

import com.goat.CalorieFruity.domain.Food;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;


@Controller
@RequestMapping
public class WebController {
    @RequestMapping(value ="/index")
    public String index(){
        return "/";
    }

    @RequestMapping(value ="/foods")
    public String foods(){
    return "foods";

}

    @RequestMapping(value ="/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping(value ="/about")
    public String about(){
        return "about";
    }

}
