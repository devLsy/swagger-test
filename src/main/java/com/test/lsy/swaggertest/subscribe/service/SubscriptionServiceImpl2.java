package com.test.lsy.swaggertest.subscribe.service;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.model.Chronology;
import com.test.lsy.swaggertest.model.RegDate;
import com.test.lsy.swaggertest.subscribe.model.Subscrption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("subscribeService2")
@Slf4j
public class SubscriptionServiceImpl2 implements SubscriptionService {

    @Override
    public ApiResponse getList(int page, int size) {
        // db에서 가져온 값이라고 가정
        List<Subscrption> databaseResult = List.of(
                new Subscrption(
                        "217",
                        "devlsy",
                        "마스터",
                        4900,
                        "2025.02.13",
                        createRegDate(2025, 1, 13, 16, 6, 15, "MONDAY"),
                        false
                ),
                new Subscrption(
                        "216",
                        "devlsy",
                        "골드",
                        4900,
                        "2025.01.13",
                        createRegDate(2025, 1, 13, 16, 1, 8, "MONDAY"),
                        true
                ),
                new Subscrption(
                        "215",
                        "devlsy",
                        "골드",
                        4900,
                        "2025.01.13",
                        createRegDate(2025, 1, 13, 13, 1, 4, "MONDAY"),
                        true
                )
        );
        // stream API 사용 > 생성자 + setter 방식
//        List<Subscrption> subscriptions = databaseResult.stream().map(data -> {
//                    Subscrption dto = new Subscrption();
//                    dto.setSubscriptionsSeq(data.getSubscriptionsSeq());
//                    dto.setMemberId(data.getMemberId());
//                    dto.setProductName(data.getProductName());
//                    dto.setTransactionAmount(data.getTransactionAmount());
//                    dto.setSubscribeEndDate(data.getSubscribeEndDate());
//                    dto.setRefunded(data.isRefunded());
//                    return dto;
//                })
//                .collect(Collectors.toList());
        // stream API 사용 > builder 방식
        List<Subscrption> subscriptions = databaseResult.stream()
                .map(data -> Subscrption.builder()
                            .subscriptionsSeq(data.getSubscriptionsSeq())
                            .memberId(data.getMemberId())
                            .productName(data.getProductName())
                            .transactionAmount(data.getTransactionAmount())
                            .subscribeEndDate(data.getSubscribeEndDate())
                            .refunded(data.isRefunded())
                            .build()
                )
                .collect(Collectors.toList());

        ApiResponse<Subscrption> response = new ApiResponse();
        response.setData(subscriptions);
        response.setPage(page);
        response.setSize(size);
        response.setTotalCount(56);
        response.setHasNext(page * size < 56);

//        log.info("list => [{}]", ToStringBuilder.reflectionToString(response, ToStringStyle.JSON_STYLE));
        log.info("list => [{}]", response);

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
