package com.test.lsy.swaggertest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.test.lsy.swaggertest.subscribe.model.CurrentSubscriptionEndDate;
import com.test.lsy.swaggertest.subscribe.model.CurrentSubscriptionStartDate;
import com.test.lsy.swaggertest.subscribe.model.NextBillingDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse3<T> {

    private boolean hasCurrentSubscription;
    private String currentSubscriptionProductSeq;
    private String currentSubscriptionProductName;

    private CurrentSubscriptionStartDate currentSubscriptionStartDate;
    private CurrentSubscriptionEndDate currentSubscriptionEndDate;

    private String currentSubscriptionStatus;
    private String nextSubscriptionProductSeq;
    private String nextSubscriptionProductName;
    private String nextChangeDate;
    private NextBillingDate nextBillingDate;
    private boolean hasStandbySubscription;
}
