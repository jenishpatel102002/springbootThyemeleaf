package com.example.demo.RepoClass;

import com.example.demo.DataClass.count;
import jakarta.persistence.LockModeType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

public interface countJpaRepo extends JpaRepository<count,Integer> {


    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Transactional
    @Query("select u from  count  u where u.year=:year")
    count findByYear(String year);

}
