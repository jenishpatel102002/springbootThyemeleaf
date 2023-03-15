package com.example.demo.RepoClass;

import com.example.demo.DataClass.count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

public interface countJpaRepo extends JpaRepository<count,Integer> {

    @Query("select u from count u where u.year=:year and u.type=:type")
    public count findByYearAndType(String year,String type);

    @Query(value = "select  u from count u where u.year=:year and u.type=:type")
    public count returnCount(String year, String type);

    @Query(value = "update  count u  set u.total=u.total+1 where u.year=:year and u.type=:type")
    public int updateCount(String year, String type);




}
