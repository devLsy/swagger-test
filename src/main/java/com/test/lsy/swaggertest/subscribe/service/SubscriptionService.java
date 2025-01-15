package com.test.lsy.swaggertest.subscribe.service;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.subscribe.model.Subscrption;

public interface SubscriptionService {
    ApiResponse<Subscrption> getList(int page, int size);
}
