package com.example.myapplication.model;

public class NguoiDung {
    String userName;
    String password;
    String hoTen;
    String gMail;
public NguoiDung(){}
    public NguoiDung(String userName, String password, String gMail, String hoTen) {
        this.userName = userName;
        this.password = password;
        this.hoTen = hoTen;
        this.gMail = gMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getgMail() {
        return gMail;
    }

    public void setgMail(String gMail) {
        this.gMail = gMail;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "NguoiDung {"+
                "userName = '"+userName+'\''+
                ", password = ' "+password + '\''+
                ", gmail = ' "+gMail + '\''+
                ", hoTen = ' "+hoTen + '\''+
                '}';
    }
}
