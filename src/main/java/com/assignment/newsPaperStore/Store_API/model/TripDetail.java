package com.assignment.newsPaperStore.Store_API.model;

import javax.persistence.*;

@Entity
@Table(name = "trip_detail")
public class TripDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trip_id")
    private int tripId;
    private String status;
    private String date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subscriber_id")
    private SubscriberDetail subscriberDetail;

    /////////////////
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "driver_id")
//    private DriverLogin driverLogin;
//    @ManyToOne
//    @JoinColumn(name = "subscriber_id")
//    private SubscriberDetail subscriberDetail;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subscription_id")
    private SubscriptionDetail subscriptionDetail;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

//    public DriverLogin getDriverLogins() {
//        return driverLogin;
//    }
//
//    public void setDriverLogins(DriverLogin driverLogin) {
//        this.driverLogin = driverLogin;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public SubscriberDetail getSubscriberDetail() {
        return subscriberDetail;
    }

    public void setSubscriberDetail(SubscriberDetail subscriberDetail) {
//        this.subscriberDetail = subscriberDetail;
    }

    public SubscriptionDetail getSubscriptionDetail() {
        return subscriptionDetail;
    }

    public void setSubscriptionDetail(SubscriptionDetail subscriptionDetail) {
        this.subscriptionDetail = subscriptionDetail;
    }
}
