package com.assignment.newsPaperStore.Store_API.Repository;

import com.assignment.newsPaperStore.Store_API.model.TripDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TripDetailRepository extends JpaRepository<TripDetail,Integer> {

//    @Query("SELECT t FROM TripDetail t WHERE t.driverId = :driverId AND t.date = :date")
//    List<TripDetail> getTripDetailsByDateAndDriverId(String driverId, String date);
}
