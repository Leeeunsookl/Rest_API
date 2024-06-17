package com.ohgiraffers.restapi.section02.responseentity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/entity")
public class ResponseEntityTestController {

    /* 필기.
    *   ResponseEntity 란?
    *   결과 데이터와 HTTP 상태 코드를 직접 제어할 수 있는 클래스이다.
    *   HttpStatus, HttpHeaders, HttpBody 를 포함하고 있다.
    *  */

    private List<UserDTO> users;

    public ResponseEntityTestController() {
        users = new ArrayList<>();

        users.add(new UserDTO(1, "user01", "pass01", "너구리", LocalDate.now()));
        users.add(new UserDTO(2, "user02", "pass02", "코알라", LocalDate.now()));
        users.add(new UserDTO(3, "user03", "pass03", "푸바오", LocalDate.now()));
    }

}
