package com.example.demo.RepoClass;

import com.example.demo.DataClass.inflowTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface inflowJpaRepo extends JpaRepository<inflowTable,Integer> {
}
