package com.goat.CalorieFruity.Food;

import com.goat.CalorieFruity.Food.Food;
import org.springframework.web.bind.annotation.*;


@RestController
public class FoodController {

    @RequestMapping (path = "/foods")
    Food returnFood(){
        return new Food("apple","Fruit",2,2,2,2,2,2,2,2);
    }



}
