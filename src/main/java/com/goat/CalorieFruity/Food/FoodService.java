package com.goat.CalorieFruity.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class FoodService {



    private final foodRepository foodRepository;
    @Autowired
    public FoodService(foodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<String> getFoods(){
     List<String> list = new ArrayList<>();
        for(int i = 0;i<foodRepository.getFoodGroups().size();i++){
            list.add(foodRepository.getFoodGroups().get(i));

        }

        return list;
        }




}
