package com.example.demo.RepoClass;

import com.example.demo.DataClass.newCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface necatJpaRepo extends JpaRepository<newCategory,Integer> {
    @Query("select u.chemicalname from newCategory u where u.category=:category")
    List<String> findchemical(String category);

    @Query("select u from newCategory u where u.category=:cat and u.chemicalname=:chname")
    newCategory findData(String cat,String chname);

}
