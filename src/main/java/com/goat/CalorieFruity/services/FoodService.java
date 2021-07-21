package com.goat.CalorieFruity.services;

import com.goat.CalorieFruity.model.Food;
import com.goat.CalorieFruity.repositories.foodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FoodService {



    private final foodRepository foodRepository;

    public FoodService(foodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getFoods(){


        return foodRepository.getFood();
        }




}
