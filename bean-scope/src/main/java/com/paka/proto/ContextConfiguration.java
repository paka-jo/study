package com.paka.proto;

import com.paka.common.Chicken;
import com.paka.common.Kimbap;
import com.paka.common.Product;
import com.paka.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product tunaKimbap() {

        return new Kimbap("참치삼각깁밥",1800,350);
    }

    @Bean
    public Product kimchiKimbap() {

        return  new Kimbap("김치삼각김밥",1500,330);
    }

    @Bean
    public Product volcano() {

        return new Chicken("볼케이노치킨",22000,new java.util.Date());
    }

    @Bean
    public Product Seasoned() {

        return  new Chicken("양념치킨",20000,new java.util.Date());
    }
    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {

        return new ShoppingCart();
    }

}