package com.ytst.learn;

/**
 * @project JavaProjectWorkSpace
 * @description 测试
 * @author tlian
 * @date 9/19/2023 16:40:37
 * @version 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone testPhoneSub = new Phone();
        // shift F6 批量修改需要更改的变量名
        System.out.println(testPhoneSub.price);

        testPhoneSub.brand = "xiaomi";
        testPhoneSub.price = 1111;

        System.out.println(testPhoneSub.price);

        testPhoneSub.call();
        testPhoneSub.play();
        login("q");
    }
    public static void login(String username){


        long loginTime = System.currentTimeMillis();
        StringBuffer sd = new StringBuffer();
        for(int i = 0; i < 10000;i++){
            sd.append(i);
        }
        System.out.println(sd.toString());
        long lastLoginTime = System.currentTimeMillis();
        System.out.println(lastLoginTime - loginTime);
    }
}
