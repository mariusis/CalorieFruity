package com.goat.CalorieFruity.controllers;

import com.goat.CalorieFruity.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FoodController {
    @Autowired
    FoodService foodService;

   @GetMapping("/food")
    public ModelAndView food(){
    ModelAndView mv = new ModelAndView();
    mv.setViewName("food");
    mv.addObject("foods",foodService.getFoods());
    return mv;
   }




}
