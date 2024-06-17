package com.ohgiraffers.restapi.section01.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/response")
public class ResponseTestController {

    /* 문자열 응답 test */
    @GetMapping("/hello")
    public String helloworld() {

        System.out.println("hello world");

        return "hello world!!!";
    }

    /* 기본 자료형 test */
    @GetMapping("/random")
    public int getRandomNumber() {

        return (int)(Math.random() * 10) + 1;
    }

}
