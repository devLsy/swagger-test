package com.test.lsy.swaggertest.service;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.model.Chronology;
import com.test.lsy.swaggertest.model.RegDate;
import com.test.lsy.swaggertest.model.Subscrption;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Override
    public ApiResponse getList(int page, int size) {

        List<Subscrption> subscriptions = new ArrayList<>();

        Subscrption subscription1 = new Subscrption();
        subscription1.setSubscriptionsSeq("217");
        subscription1.setMemberId("devlsy");
        subscription1.setProductName("마스터");
        subscription1.setTransactionAmount(13000);
        subscription1.setSubscribeEndDate("2025.02.13");
        subscription1.setRefunded(false);
        subscription1.setRegDate(createRegDate(2025, 1, 13, 16, 6, 15, "MONDAY"));

        Subscrption subscription2 = new Subscrption();
        subscription2.setSubscriptionsSeq("216");
        subscription2.setMemberId("devlsy");
        subscription2.setProductName("골드");
        subscription1.setTransactionAmount(4900);
        subscription2.setSubscribeEndDate("2025.01.13");
        subscription2.setRefunded(true);
        subscription2.setRegDate(createRegDate(2025, 1, 13, 16, 1, 8, "MONDAY"));

        subscriptions.add(subscription1);
        subscriptions.add(subscription2);

        ApiResponse response = new ApiResponse();
        response.setData(subscriptions);
        response.setPage(page);
        response.setSize(size);
        response.setTotalCount(56);
        response.setHasNext(page * size < 56);

        log.info("list = [{}]", ToStringBuilder.reflectionToString(response, ToStringStyle.JSON_STYLE));

        return response;
    }

    private RegDate createRegDate(int year, int month, int day, int hour, int minute, int second, String dayOfWeek) {
        RegDate regDate = new RegDate();
        regDate.setYear(year);
        regDate.setMonthValue(month);
        regDate.setDayOfMonth(day);
        regDate.setDayOfYear(day); // 예시로 단순 설정
        regDate.setHour(hour);
        regDate.setMinute(minute);
        regDate.setSecond(second);

        Chronology chronology = new Chronology();
        chronology.setCalendarType("iso8601");

        return regDate;
    }
}
