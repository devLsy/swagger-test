package com.test.lsy.swaggertest.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "구독정보")
public class Subscrption  extends BaseObj {
    @Schema(description = "구독번호")
    private String subscriptionsSeq;
    @Schema(description = "아이디")
    private String memberId;
    @Schema(description = "상품명")
    private String productName;
    @Schema(description = "결제금액")
    private int transactionAmount;
    @Schema(description = "구독종료일")
    private String subscribeEndDate;
    @Schema(description = "등록일")
    private RegDate regDate;
    @Schema(description = "반환여부")
    private boolean refunded;
}
