package com.goat.CalorieFruity.Food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface foodRepository extends JpaRepository<Food,Long> {
    @Query(value = "SELECT 'Food Group' FROM foods",nativeQuery = true)
    List<String> foodGroups();
}
