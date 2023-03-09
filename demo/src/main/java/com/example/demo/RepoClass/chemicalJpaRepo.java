package com.example.demo.RepoClass;

import com.example.demo.DataClass.Chemical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface chemicalJpaRepo extends JpaRepository<Chemical,Integer> {
    @Query("select u.chemicalname from Chemical u")
    public List<String> findChemicalname();
}
