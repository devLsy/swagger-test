package com.test.lsy.swaggertest.user.service;

import com.test.lsy.swaggertest.model.ApiResponse4;
import com.test.lsy.swaggertest.user.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("UserService1")
@Slf4j
public class UserServiceImpl implements UserService{

    @Override
    public ApiResponse4 getList(int page, int size) {

        //1
        User.Address.Geo geo1 = User.Address.Geo.builder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();

        User.Address address1 = User.Address.builder()
                .street("Kulas Light")
                .suite("Apt. 556")
                .city("Gwenborough")
                .zipcode("92998-3874")
                .geo(geo1)
                .build();

        User.Company company1 = User.Company.builder()
                .name("Romaguera-Crona")
                .catchPhrase("Multi-layered client-server neural-net")
                .bs("harness real-time e-markets")
                .build();

        User user1 = User.builder()
                .id("1")
                .name("Leanne Graham")
                .username("Bret")
                .email("Sincere@april.biz")
                .address(address1)
                .company(company1)
                .phone("1-770-736-8031 x56442")
                .website("hildegard.org")
                .build();
        //2
        User.Address.Geo geo2 = User.Address.Geo.builder()
                .lat("-43.9509")
                .lng("-34.4618")
                .build();

        User.Address address2 = User.Address.builder()
                .street("Victor Plains")
                .suite("Suite 879")
                .city("Wisokyburgh")
                .zipcode("90566-7771")
                .geo(geo2)
                .build();

        User.Company company2 = User.Company.builder()
                .name("Deckow-Crist")
                .catchPhrase("Proactive didactic contingency")
                .bs("synergize scalable supply-chains")
                .build();

        User user2 = User.builder()
                .id("2")
                .name("Ervin Howell")
                .username("Antonette")
                .email("Shanna@melissa.tv")
                .address(address2)
                .company(company2)
                .phone("010-692-6593 x09125")
                .website("anastasia.net")
                .build();

        //3
        User.Address.Geo geo3 = User.Address.Geo.builder()
                .lat("-68.6102")
                .lng("-47.0653")
                .build();

        User.Address address3 = User.Address.builder()
                .street("Douglas Extension")
                .suite("Suite 847")
                .city("McKenziehaven")
                .zipcode("59590-4157")
                .geo(geo3)
                .build();

        User.Company company3 = User.Company.builder()
                .name("Romaguera-Jacobson")
                .catchPhrase("Face to face bifurcated interface")
                .bs("e-enable strategic applications")
                .build();

        User user3 = User.builder()
                .id("3")
                .name("Clementine Bauch")
                .username("Samantha")
                .email("Nathan@yesenia.net")
                .address(address3)
                .company(company3)
                .phone("1-463-123-4447")
                .website("ramiro.info")
                .build();

        //4
        User.Address.Geo geo4 = User.Address.Geo.builder()
                .lat("-68.6102")
                .lng("-47.0653")
                .build();

        User.Address address4 = User.Address.builder()
                .street("Douglas Extension")
                .suite("Suite 847")
                .city("McKenziehaven")
                .zipcode("59590-4157")
                .geo(geo3)
                .build();

        User.Company company4 = User.Company.builder()
                .name("Romaguera-Jacobson")
                .catchPhrase("Face to face bifurcated interface")
                .bs("e-enable strategic applications")
                .build();

        User user4 = User.builder()
                .id("4")
                .name("Clementine Bauch")
                .username("Samantha")
                .email("Nathan@yesenia.net")
                .address(address3)
                .company(company3)
                .phone("1-463-123-4447")
                .website("ramiro.info")
                .build();

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ApiResponse4<User> response = new ApiResponse4<>();
        response.setCode(HttpStatus.OK);
        response.setError("");
        response.setMessage("정상입니다.");
        response.setData(list);
        return response;
    }
}
