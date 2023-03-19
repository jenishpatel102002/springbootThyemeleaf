package com.example.demo.RepoClass;

import com.example.demo.DataClass.cheackediteams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface cheackeditemsJpaRepo extends JpaRepository<cheackediteams,Integer> {

    @Query("select u from cheackediteams u where u.newid=:id")
    List<cheackediteams> findByNewid(String id);
}
