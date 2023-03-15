package com.example.demo.RepoClass;

import com.example.demo.DataClass.inflowTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface inflowJpaRepo extends JpaRepository<inflowTable,Integer> {
}



//@Repository
//public interface NumberRepository extends JpaRepository<NumberEntity, Long> {
//
//    @Modifying
//    @Query(value = "LOCK TABLE number_entity IN SHARE ROW EXCLUSIVE MODE", nativeQuery = true)
//    void lockTable();
//
//    @Modifying
//    @Query(value = "UPDATE number_entity SET year = :year, number = :number WHERE id = :id", nativeQuery = true)
//    int updateNumber(@Param("id") Long id, @Param("year") int year, @Param("number") int number);
//
//    @Modifying
//    @Query(value = "UNLOCK TABLES", nativeQuery = true)
//    void unlockTable();
//
//}
