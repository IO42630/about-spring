package com.olexyn.about.spring.boot.aop;

import org.springframework.stereotype.Service;

@Service
public class SomeService {

    public String concat(String a, String b) {
        return a + b;
    }

}
