package com.paka.annotation_circulation.common;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public void cry() {
        System.out.println("Meow");

    }
}