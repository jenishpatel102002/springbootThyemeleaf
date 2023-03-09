package com.example.demo.RepoClass;

import com.example.demo.DataClass.count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface countJpaRepo extends JpaRepository<count,Integer> {
    @Query("select u from count u where u.year=:year and u.type=:type")
    public count findByYearAndType(String year,String type);




}
