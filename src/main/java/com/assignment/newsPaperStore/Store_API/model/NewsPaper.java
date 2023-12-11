package com.assignment.newsPaperStore.Store_API.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "news_paper")
public class NewsPaper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int newsPaperId;

    private String description;
//    @OneToMany(mappedBy = "newsPaper")
//    private List<SubscriptionDetail> subscriptionDetails;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sub_type_id")
    private SubscriptionType subscriptionType;
//
    public int getNewsPaperId() {
        return newsPaperId;
    }

    public void setNewsPaperId(int newsPaperId) {
        this.newsPaperId = newsPaperId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public List<SubscriptionDetail> getSubscriptionDetails() {
//        return subscriptionDetails;
//    }
//
//    public void setSubscriptionDetails(List<SubscriptionDetail> subscriptionDetails) {
//        this.subscriptionDetails = subscriptionDetails;
//    }
//
    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
}
