package com.assignment.newsPaperStore.Store_API.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subscription_type")
public class SubscriptionType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subTypeId;

    private String description;
//    @OneToMany(mappedBy = "subscriptionType")
//    private List<NewsPaper> newsPapers;
//
    public int getSubTypeId() {
        return subTypeId;
    }

    public void setSubTypeId(int subTypeId) {
        this.subTypeId = subTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//
//    public List<NewsPaper> getNewsPapers() {
//        return newsPapers;
//    }
//
//    public void setNewsPapers(List<NewsPaper> newsPapers) {
//        this.newsPapers = newsPapers;
//    }
}
