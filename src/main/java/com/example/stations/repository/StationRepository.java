package com.example.stations.repository;

import com.example.stations.models.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;



@Repository
public interface StationRepository extends JpaRepository<Station,Long> {


    Optional<Station> findByName(String name);

    @Query("SELECT AVG(s.dieselPrice) FROM Station s")
    BigDecimal findAverageDieselPrice();

    @Query("SELECT MAX(s.dieselPrice) FROM Station s")
    BigDecimal findMaxDieselPrice();

    @Query("SELECT MIN(s.dieselPrice) FROM Station s")
    BigDecimal findMinDieselPrice();

    @Query("SELECT AVG(s.e5Price) FROM Station s")
    BigDecimal findAverageE5Price();

    @Query("SELECT MAX(s.e5Price) FROM Station s")
    BigDecimal findMaxE5Price();

    @Query("SELECT MIN(s.e5Price) FROM Station s")
    BigDecimal findMinE5Price();

    @Query("SELECT AVG(s.e10Price) FROM Station s")
    BigDecimal findAverageE10Price();

    @Query("SELECT MAX(s.e10Price) FROM Station s")
    BigDecimal findMaxE10Price();

    @Query("SELECT MIN(s.e10Price) FROM Station s")
    BigDecimal findMinE10Price();



}

