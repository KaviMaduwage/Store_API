package com.assignment.newsPaperStore.Store_API.service;

import com.assignment.newsPaperStore.Store_API.Repository.DriverLoginsRepository;
import com.assignment.newsPaperStore.Store_API.model.DriverLogin;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverLoginServiceImpl implements DriverLoginsService{
    DriverLoginsRepository driverLoginsRepository;

    public DriverLoginServiceImpl(DriverLoginsRepository driverLoginsRepository) {
        this.driverLoginsRepository = driverLoginsRepository;
    }

    @Override
    public DriverLogin getDriverLogin(String id) {
        try{
            DriverLogin login=  driverLoginsRepository.findById(id).get();
            return login;
        }catch (Exception e){
            return new DriverLogin();
        }

    }

//    @Override
//    public List<DriverLogin> getTripDetailsByDateAndDriverId(String driverId, String date) {
//        List<DriverLogin> driverLoginList = new ArrayList<>();
//        try{
//            driverLoginList = driverLoginsRepository.getTripDetailsByDateAndDriverId(driverId,date);
//            return driverLoginList;
//
//        }catch (Exception e){
//            return driverLoginList;
//        }
//    }

    @Override
    public DriverLogin getTripDetailsByDateAndDriverId(String driverId, String date) {

        try{
            DriverLogin driverLogin = driverLoginsRepository.getTripDetailsByDateAndDriverId(driverId,date);
            return driverLogin;

        }catch (Exception e){
            return new DriverLogin();
        }
    }
}
