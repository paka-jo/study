package com.paka.annotation_circulation.solution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.paka.annotation_circulation");

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }

        AnimalSer animalSer = context.getBean("animalServicePrimary", AnimalSer.class);

        animalSer.AnimalCry();


    }
}
