package com.assignment.newsPaperStore.Store_API.controller;

import com.assignment.newsPaperStore.Store_API.model.SubscriptionDetail;
import com.assignment.newsPaperStore.Store_API.model.TripDetail;
import com.assignment.newsPaperStore.Store_API.service.SubscriptionDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriptionDetail")
public class SubscriptionDetailController {
    SubscriptionDetailService subscriptionDetailService;

    public SubscriptionDetailController(SubscriptionDetailService subscriptionDetailService) {
        this.subscriptionDetailService = subscriptionDetailService;
    }

    @GetMapping("{subscriptionId}")
    public SubscriptionDetail getTripDetails(@PathVariable("subscriptionId") int subscriptionId){
        SubscriptionDetail subscriptionDetail = subscriptionDetailService.getTripDetail(subscriptionId);
        return subscriptionDetail;

    }
}
