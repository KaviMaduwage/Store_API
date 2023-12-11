package com.assignment.newsPaperStore.Store_API.service;

import com.assignment.newsPaperStore.Store_API.Repository.SubscriptionDetailRepository;
import com.assignment.newsPaperStore.Store_API.model.DriverLogin;
import com.assignment.newsPaperStore.Store_API.model.SubscriptionDetail;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionDetailServiceImpl implements SubscriptionDetailService{
    SubscriptionDetailRepository subscriptionDetailRepository;

    public SubscriptionDetailServiceImpl(SubscriptionDetailRepository subscriptionDetailRepository) {
        this.subscriptionDetailRepository = subscriptionDetailRepository;
    }

    @Override
    public SubscriptionDetail getTripDetail(int subscriptionId) {
        try{
            SubscriptionDetail detail=  subscriptionDetailRepository.findById(subscriptionId).get();
            return detail;
        }catch (Exception e){
            return new SubscriptionDetail();
        }
    }
}
