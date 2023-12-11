package com.assignment.newsPaperStore.Store_API.model;

import javax.persistence.*;

@Entity
@Table(name = "subscription_detail")
public class SubscriptionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subscriptionId;
    private String startDate;
    private String endDate;
//    @ManyToOne
//    @JoinColumn(name = "subscriber_id")
//    private SubscriberDetail subscriberDetail;
//
    @ManyToOne
    @JoinColumn(name = "news_paper_id")
    private NewsPaper newsPaper;
//    @OneToOne(mappedBy = "subscriptionDetail")
//    private TripDetail tripDetail;
//
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    //
//    public SubscriberDetail getSubscriberDetail() {
//        return subscriberDetail;
//    }
//
//    public void setSubscriberDetail(SubscriberDetail subscriberDetail) {
//        this.subscriberDetail = subscriberDetail;
//    }
//
    public NewsPaper getNewsPaper() {
        return newsPaper;
    }

    public void setNewsPaper(NewsPaper newsPaper) {
        this.newsPaper = newsPaper;
    }
//
//    public TripDetail getTripDetail() {
//        return tripDetail;
//    }
//
//    public void setTripDetail(TripDetail tripDetail) {
//        this.tripDetail = tripDetail;
//    }
}
