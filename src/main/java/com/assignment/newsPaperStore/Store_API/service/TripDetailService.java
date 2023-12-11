package com.assignment.newsPaperStore.Store_API.service;

import com.assignment.newsPaperStore.Store_API.model.TripDetail;

import java.util.List;

public interface TripDetailService {
    public TripDetail getTripDetail(int tripId);

   // List<TripDetail> getTripDetailsByDateAndDriverId(String driverId, String date);
}
