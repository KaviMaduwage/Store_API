package com.assignment.newsPaperStore.Store_API.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "driver_login")
public class DriverLogin {
    @Id
    @Column(name = "driver_id")
    private String driverId; // nic number is taken as the primary key
    private String driverUserName;
    private String password;



    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "driver_id")
    private List<TripDetail> tripDetails;

//    @OneToMany(mappedBy = "driverLogin",cascade = CascadeType.ALL)
//    private List<TripDetail> tripDetails;

    public DriverLogin() {
    }

    public DriverLogin(String id, String userName, String password) {
        this.driverId = id;
        this.driverUserName = userName;
        this.password = password;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverUserName() {
        return driverUserName;
    }

    public void setDriverUserName(String driverUserName) {
        this.driverUserName = driverUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripDetail> getTripDetails() {
        return tripDetails;
    }

    public void setTripDetails(List<TripDetail> tripDetails) {
        this.tripDetails = tripDetails;
    }

}
