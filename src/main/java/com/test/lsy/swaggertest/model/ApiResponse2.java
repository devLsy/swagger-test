package com.test.lsy.swaggertest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse2<T> {

    private HttpStatus status;      // HTTP 상태 코드
    private String message;         // 메시지
    private T data;                 // 데이터
    private ErrorResponse error;           // 에러 정보

    @Data
    @NoArgsConstructor @AllArgsConstructor
    @Builder
    public static class ErrorResponse {
        private String code;            // 에러코드
        private String detail;          // 에러 상세 메시지
    }

    // 성공 응답 생성
    public static <T> ApiResponse2<T> success(HttpStatus status, String message, T data) {
        return ApiResponse2.<T>builder()
                .status(status)
                .message(message)
                .data(data)
                .build();
    }

    // 실패 응답 생성
    public static <T> ApiResponse2<T> failure(HttpStatus status, String message, String errorCode, String errorDetail) {
        return ApiResponse2.<T>builder()
                .status(status)
                .message(message)
                .error(new ErrorResponse(errorCode, errorDetail))
                .build();
    }
}
