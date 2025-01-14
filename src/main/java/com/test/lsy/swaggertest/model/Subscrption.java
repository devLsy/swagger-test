package com.test.lsy.swaggertest.model;

import lombok.Data;

@Data
public class Subscrption  extends BaseObj{
    private String subscriptionsSeq;
    private String memberId;
    private String productName;
    private int transactionAmount;
    private String subscribeEndDate;
    private RegDate regDate;
    private boolean refunded;
}
