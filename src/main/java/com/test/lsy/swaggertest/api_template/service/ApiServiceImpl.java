package com.test.lsy.swaggertest.api_template.service;

import com.test.lsy.swaggertest.api_template.model.RandomUserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service("apiService1")
@Slf4j
public class ApiServiceImpl implements ApiService{

    private final RestTemplate restTemplate;

    @Override
    public RandomUserResponse getRandomUser() {

        String url = "https://randomuser.me/api/";
        ResponseEntity<RandomUserResponse> response = restTemplate.getForEntity(url, RandomUserResponse.class);

        log.info("list => {}", response.getBody());
        return response.getBody();
    }
}
