package com.st.day202327.dog;

/**
 * @project JavaProjectWorkSpace
 * @description dog
 * @author HuShuangFu
 * @date 2023/9/27 10:14:43
 * @version 1.0
 */
public class Dog {
    private String color;

    public Dog() {
        System.out.println("Dog 构造");
    }

    public Dog(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  void run(){
        System.out.println("Running");
    }
}
