package com.example.hello3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3Controller {

        @GetMapping("/hello3")
        public String hello3() {
            return "Spring Boot Hello3";
        }
}
