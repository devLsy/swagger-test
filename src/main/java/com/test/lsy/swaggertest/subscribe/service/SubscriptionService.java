package com.test.lsy.swaggertest.subscribe.service;

import com.test.lsy.swaggertest.model.ApiResponse1;

public interface SubscriptionService {
    ApiResponse1 getList(int page, int size);
}
