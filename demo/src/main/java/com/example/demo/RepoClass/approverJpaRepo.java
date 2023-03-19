package com.example.demo.RepoClass;

import com.example.demo.DataClass.approverclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface approverJpaRepo extends JpaRepository<approverclass,Integer> {
    @Query("select u from approverclass u where u.flag=:flag")
    List<approverclass> findByFlag(String flag);

    List<approverclass> findByOutflowid(String approveid);
}
