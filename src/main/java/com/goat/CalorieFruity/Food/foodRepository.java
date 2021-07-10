package com.goat.CalorieFruity.Food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.List;

public interface foodRepository extends JpaRepository<Food,Long> {
    @Query(value = "Select * from foods where id between 10 and 20",nativeQuery = true)
    List<String> getFoodGroups();


}
