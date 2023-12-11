package com.assignment.newsPaperStore.Store_API.service;

import com.assignment.newsPaperStore.Store_API.Repository.TripDetailRepository;
import com.assignment.newsPaperStore.Store_API.model.DriverLogin;
import com.assignment.newsPaperStore.Store_API.model.TripDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TripDetailServiceImpl implements TripDetailService{

    TripDetailRepository tripDetailRepository;

    public TripDetailServiceImpl(TripDetailRepository tripDetailRepository) {
        this.tripDetailRepository = tripDetailRepository;
    }

    @Override
    public TripDetail getTripDetail(int tripId) {
        try{
            TripDetail tripDetail=  tripDetailRepository.findById(tripId).get();
            return tripDetail;
        }catch (Exception e){
            return new TripDetail();
        }
    }

//    @Override
//    public List<TripDetail> getTripDetailsByDateAndDriverId(String driverId, String date) {
//        List<TripDetail> tripDetails = new ArrayList<>();
//        try{
//            tripDetails = tripDetailRepository.getTripDetailsByDateAndDriverId(driverId,date);
//            return tripDetails;
//
//        }catch (Exception e){
//            return tripDetails;
//        }
//    }
}
