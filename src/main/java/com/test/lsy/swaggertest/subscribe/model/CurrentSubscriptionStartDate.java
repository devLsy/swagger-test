package com.test.lsy.swaggertest.subscribe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CurrentSubscriptionStartDate {
    private String dayOfYear;
    private String year;
    private String month;
    private String monthValue;
    private String dayOfMonth;
    private String hour;
    private String minute;
    private String second;
    private String nano;
    private String dayOfWeek;

    private Chronology chronology;
}
