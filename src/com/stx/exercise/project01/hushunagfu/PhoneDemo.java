package com.stx.exercise.project01.hushunagfu;

/**
 * @project JavaProjectWorkSpace
 * @description phone test
 * @author HuShuangFu
 * @date 2023/9/28 21:40:39
 * @version 1.0
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone[] phones = new Phone[100];
        PhoneManager phoneManager = new PhoneManager();
        phoneManager.setPhone(phones);
        phoneManager.start();
    }
}
