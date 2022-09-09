package com.buchalka;

public class Main {
    public static void main(String[] args) {
        ITelephone lenasPhone;
        lenasPhone = new DeskPhone(123456);
        lenasPhone.powerOn();
        lenasPhone.callPhone(123456);
        lenasPhone.answer();

        lenasPhone = new MobilePhone(245678);
        lenasPhone.powerOn();
        lenasPhone.callPhone(245678);
        lenasPhone.answer();

    }
}