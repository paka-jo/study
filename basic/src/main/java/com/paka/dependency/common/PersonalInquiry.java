package com.paka.dependency.common;

public class PersonalInquiry implements Inquiry{

    private String nickname;
    private String code;

    public PersonalInquiry(){}

    public PersonalInquiry(String nickname, String code) {
        this.nickname = nickname;
        this.code = code;
    }

    @Override
    public String getInquiry() {

        return this.nickname + "님의 코드번호는" +this.code + "입니다";
    }

    @Override
    public String toString() {
        return getInquiry();
    }
}
