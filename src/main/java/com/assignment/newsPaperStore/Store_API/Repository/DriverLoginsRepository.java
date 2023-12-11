package com.assignment.newsPaperStore.Store_API.Repository;

import com.assignment.newsPaperStore.Store_API.model.DriverLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverLoginsRepository extends JpaRepository<DriverLogin, String> {
//    @Query("SELECT d FROM DriverLogin d JOIN d.tripDetails t WHERE d.driverId = :driverId AND t.date = :date")
//    List<DriverLogin> getTripDetailsByDateAndDriverId(String driverId, String date);

    @Query("SELECT d FROM DriverLogin d JOIN FETCH d.tripDetails t WHERE d.driverId = :driverId AND t.date = :date")
    DriverLogin getTripDetailsByDateAndDriverId(String driverId, String date);
}
