package com.paka.dependency.app;

import com.paka.dependency.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(memberconfigu.class);

        MemberDTO member = context.getBean("member", MemberDTO.class);

        System.out.println(member);
        System.out.println(member.getNickname().getInquiry());



    }
}
