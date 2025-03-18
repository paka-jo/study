package com.paka.dependency.app;

import com.paka.dependency.common.Inquiry;
import com.paka.dependency.common.MemberDTO;
import com.paka.dependency.common.PersonalInquiry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class memberconfigu {

    @Bean
    public Inquiry NickNameGenerator() {

        return new PersonalInquiry("alpaca","23412");
    }


    @Bean (name = "member" )
    public MemberDTO getMember() {
        return new MemberDTO("PAKA","pa1234","알파카","01012345678",NickNameGenerator());
    }

}