package com.paka.annotation_circulation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

    @Override
    public void cry() {
        System.out.println("mungmung");

    }
}