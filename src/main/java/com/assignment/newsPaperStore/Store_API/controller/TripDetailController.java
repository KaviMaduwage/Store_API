package com.assignment.newsPaperStore.Store_API.controller;

import com.assignment.newsPaperStore.Store_API.model.DriverLogin;
import com.assignment.newsPaperStore.Store_API.model.TripDetail;
import com.assignment.newsPaperStore.Store_API.service.TripDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tripDetail")
public class TripDetailController {
    TripDetailService tripDetailService;

    public TripDetailController(TripDetailService tripDetailService) {
        this.tripDetailService = tripDetailService;
    }

    @GetMapping("{tripId}")
    public TripDetail getTripDetails(@PathVariable("tripId") int tripId){
        TripDetail tripDetail = tripDetailService.getTripDetail(tripId);
        return tripDetail;

    }
//    @GetMapping("/{driverId}/{date}")
//    public List<TripDetail> getTripDetailsByDateAndDriverId(@PathVariable("driverId") String driverId, @PathVariable("date") String date){
//        List<TripDetail> tripDetails = tripDetailService.getTripDetailsByDateAndDriverId(driverId,date);
//        return tripDetails;
//    }
}
