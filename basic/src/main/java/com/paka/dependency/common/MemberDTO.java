package com.paka.dependency.common;

public class MemberDTO {

    private String id;
    private String pwd;
    private String name;
    private String phone;
    private Inquiry nickname;

    public MemberDTO() {
    }

    public MemberDTO(String id, String pwd, String name, String phone , Inquiry nickname) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.phone = phone;
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Inquiry getNickname() {
        return nickname;
    }

    public void setNickname(Inquiry nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", nickname=" + nickname +
                '}';
    }
}
