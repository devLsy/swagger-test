package com.test.lsy.swaggertest.user.service;

import com.test.lsy.swaggertest.model.ApiResponse4;
import com.test.lsy.swaggertest.user.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("UserService1")
@Slf4j
public class UserServiceImpl implements UserService{

    @Override
    public ApiResponse4 getList(int page, int size) {

        User.Role role1 = User.Role.builder()
                .roleName("ADMIN")
                .permissions(List.of("CREATE_USER", "DELETE_USER", "UPDATE_USER", "READ_USER", "ACCESS_ADMIN_DASHBOARD"))
                .build();

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
                .role(role1)
                .phone("1-770-736-8031 x56442")
                .website("hildegard.org")
                .build();
        //2
        User.Role role2 = User.Role.builder()
                .roleName("ADMIN")
                .permissions(List.of("CREATE_USER", "DELETE_USER", "UPDATE_USER", "READ_USER", "ACCESS_ADMIN_DASHBOARD"))
                .build();

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
                .role(role2)
                .phone("010-692-6593 x09125")
                .website("anastasia.net")
                .build();

        //3
        User.Role role3 = User.Role.builder()
                .roleName("User")
                .permissions(List.of("READ_USER"))
                .build();

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
                .role(role3)
                .phone("1-463-123-4447")
                .website("ramiro.info")
                .build();

        //4
        User.Role role4 = User.Role.builder()
                .roleName("User")
                .permissions(List.of("READ_USER"))
                .build();

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
                .role(role4)
                .phone("1-463-123-4447")
                .website("ramiro.info")
                .build();

        //5
        User.Role role5 = User.Role.builder()
                .roleName("ADMIN")
                .permissions(List.of("CREATE_USER", "DELETE_USER", "UPDATE_USER", "READ_USER", "ACCESS_ADMIN_DASHBOARD"))
                .build();

        User.Address.Geo geo5 = User.Address.Geo.builder()
                .lat("-31.8129")
                .lng("62.5342")
                .build();

        User.Address address5 = User.Address.builder()
                .street("Skiles Walks")
                .suite("Suite 351")
                .city("Roscoeview")
                .zipcode("33263")
                .geo(geo5)
                .build();

        User.Company company5 = User.Company.builder()
                .name("Keebler LLC")
                .catchPhrase("User-centric fault-tolerant solution")
                .bs("revolutionize end-to-end systems")
                .build();

        User user5 = User.builder()
                .id("5")
                .name("Clementine Bauch")
                .username("Kamren")
                .email("Lucio_Hettinger@annie.ca")
                .address(address5)
                .company(company5)
                .role(role5)
                .phone("(254)954-1289")
                .website("demarco.info")
                .build();

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        List<User> result1 = list.stream()
                .map(data -> User.builder()
                        .id(data.getId())
                        .name(data.getName())
                        .username(data.getUsername())
                        .email(data.getEmail())
                        .address(data.getAddress())
                        .phone(data.getPhone())
                        .website(data.getWebsite())
                        .company(data.getCompany())
                        .role(data.getRole())
                        .build()
                )
                .collect(Collectors.toList());


        ApiResponse4<User> response = new ApiResponse4<>();
        response.setCode(HttpStatus.OK);
        response.setError("");
        response.setMessage("정상입니다.");
        response.setData(result1);
//        response.setData(list);

//        log.info("list = {}", list);
        log.info("list = {}", result1);

        return response;
    }
}
