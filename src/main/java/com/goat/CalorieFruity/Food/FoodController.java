package com.goat.CalorieFruity.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping (path = "/foods")
public class FoodController {
    @Autowired
    FoodService foodService;

    @GetMapping
   public List<String> getFoods(){
        return foodService.getFoods();
    }



}
