package com.example.demo.RepoClass;

import com.example.demo.DataClass.brandTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface brandJpaRepo extends JpaRepository<brandTable,Integer> {
}
