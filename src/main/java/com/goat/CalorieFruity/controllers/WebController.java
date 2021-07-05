package com.goat.CalorieFruity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@Controller
public class WebController {
@RequestMapping(value ="/foods")
    public String foods(){
    return "foods";
}

}
