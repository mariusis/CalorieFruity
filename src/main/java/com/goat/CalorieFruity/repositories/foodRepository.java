package com.goat.CalorieFruity.repositories;

import com.goat.CalorieFruity.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface foodRepository extends JpaRepository<Food,Long> {
    @Query(value = "Select * from foods where id between 10 and 20",nativeQuery = true)
    List<Food> getFood();


}
