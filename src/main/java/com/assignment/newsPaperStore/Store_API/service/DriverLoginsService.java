package com.assignment.newsPaperStore.Store_API.service;

import com.assignment.newsPaperStore.Store_API.model.DriverLogin;

import java.util.List;

public interface DriverLoginsService {
    public DriverLogin getDriverLogin(String id);

   // List<DriverLogin> getTripDetailsByDateAndDriverId(String driverId, String date);

    DriverLogin getTripDetailsByDateAndDriverId(String driverId, String date);
}
