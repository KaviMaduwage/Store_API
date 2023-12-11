package com.assignment.newsPaperStore.Store_API.controller;

import com.assignment.newsPaperStore.Store_API.model.DriverLogin;
import com.assignment.newsPaperStore.Store_API.service.DriverLoginsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/driverLogins")
public class DriverLoginsController {
    DriverLoginsService driverLoginsService;

    public DriverLoginsController(DriverLoginsService driverLoginsService) {
        this.driverLoginsService = driverLoginsService;
    }

    @GetMapping("{driverId}")
    public DriverLogin getDriverDetails(@PathVariable("driverId") String driverId) {
        DriverLogin driverLogin = driverLoginsService.getDriverLogin(driverId);
        return driverLogin;

    }

    @GetMapping("{driverId}/{date}")
    public DriverLogin getTripDetailsByDateAndDriverId(@PathVariable("driverId") String driverId, @PathVariable("date") String date){
        DriverLogin tripDetails = driverLoginsService.getTripDetailsByDateAndDriverId(driverId,date);
        return tripDetails;
    }


}


