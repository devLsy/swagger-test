package com.test.lsy.swaggertest.subscribe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NextBillingDate {
    private String year;
    private String month;
    private String dayOfYear;
    private boolean leapYear;
    private String monthValue;
    private String dayOfMonth;
    private String dayOfWeek;
    private String era;

    private Chronology chronology;
}
