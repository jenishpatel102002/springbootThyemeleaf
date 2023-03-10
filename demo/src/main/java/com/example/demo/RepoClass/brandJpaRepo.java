package com.example.demo.RepoClass;

import com.example.demo.DataClass.brandTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface brandJpaRepo extends JpaRepository<brandTable,Integer> {
    @Query("select u.brand from brandTable u where u.category=:cat")
    List<String> brandList(String cat);
}
