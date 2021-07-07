package com.goat.CalorieFruity.controllers;

import com.goat.CalorieFruity.domain.Food;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class FoodController {

    @RequestMapping (path = "/foods")
    Food returnFood(){
        return new Food("apple","Fruit",2,2,2,2,2,2,2,2);
    }



}
