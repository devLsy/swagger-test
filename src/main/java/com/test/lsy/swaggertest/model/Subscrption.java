package com.test.lsy.swaggertest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subscrption  extends BaseObj{
    private String subscriptionsSeq;
    private String memberId;
    private String productName;
    private int transactionAmount;
    private String subscribeEndDate;
    private RegDate regDate;
    private boolean refunded;
}
