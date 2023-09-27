package com.st.day2023925;

/**
 * @project JavaProjectWorkSpace
 * @description dog test
 * @author HuShuangFu
 * @date 2023/9/25 15:15:14
 * @version 1.0
 */
public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("小黑");

        Dog dog1 = new Dog("小白","menal","白色","哈士奇",7);
        Dog dog2 = new Dog("hh");
        dog.setLegs(7);
        System.out.println(dog.LEGS);
        dog1.printLegs();

    }
}
