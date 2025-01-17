package com.test.lsy.swaggertest.subscribe.service;

import com.test.lsy.swaggertest.model.ApiResponse3;
import com.test.lsy.swaggertest.subscribe.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("subscribeService3")
@Slf4j
public class SubscriptionServiceImpl3 implements SubscriptionService {

    @Override
    public ApiResponse3 getList(int page, int size) {

        Chronology chronology = new Chronology();
        chronology.setId("ISO");
        chronology.setCalendarType("iso8601");

        CurrentSubscriptionStartDate currentSubscriptionStartDate = CurrentSubscriptionStartDate.builder()
                .dayOfYear("3")
                .year("2025")
                .month("JAmnNUARY")
                .monthValue("1")
                .dayOfMonth("3")
                .hour("17")
                .minute("4")
                .second("33")
                .nano("0")
                .dayOfWeek("FRIDAY")
                .chronology(chronology)
                .build();

        CurrentSubscriptionEndDate currentSubscriptionEndDate = CurrentSubscriptionEndDate.builder()
                .dayOfYear("35")
                .year("2025")
                .month("FEBRUARY")
                .monthValue("2")
                .dayOfMonth("4")
                .hour("0")
                .minute("0")
                .second("0")
                .nano("0")
                .dayOfWeek("TUESDAY")
                .chronology(chronology)
                .build();
        NextBillingDate nextBillingDate = new NextBillingDate();
        nextBillingDate.setYear("2025");
        nextBillingDate.setMonth("FEBRUARY");
        nextBillingDate.setDayOfYear("34");
        nextBillingDate.setLeapYear(false);
        nextBillingDate.setMonthValue("2");
        nextBillingDate.setDayOfMonth("3");
        nextBillingDate.setDayOfWeek("MONDAY");
        nextBillingDate.setEra("CE");
        nextBillingDate.setChronology(chronology);

        //db에서 가져온 데이터라고 가정
        ApiResponse3<Subscrption> response = new ApiResponse3<>();
        response.setHasCurrentSubscription(true);
        response.setCurrentSubscriptionProductSeq("2");
        response.setCurrentSubscriptionProductName("마스터 상품");
        response.setCurrentSubscriptionStartDate(currentSubscriptionStartDate);
        response.setCurrentSubscriptionEndDate(currentSubscriptionEndDate);
        response.setCurrentSubscriptionStatus("ACTIVE");
        response.setNextSubscriptionProductSeq("2");
        response.setNextSubscriptionProductName("골드 상품");
        response.setNextChangeDate("2025-02-04");
        response.setNextBillingDate(nextBillingDate);
        response.setHasStandbySubscription(false);

        return response;
    }
}
