package com.paka.annotationBean.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

        public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext("com.paka.annotationBean");

            DictionaryService directoryService = context.getBean("directoryServiceConstrucor",DictionaryService.class);

            directoryService.selectAllDirectorys().forEach(System.out::println);

        }
    }

