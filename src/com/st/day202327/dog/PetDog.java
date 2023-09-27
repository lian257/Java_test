package com.st.day202327.dog;

/**
 * @project JavaProjectWorkSpace
 * @description pet
 * @author HuShuangFu
 * @date 2023/9/27 10:17:30
 * @version 1.0
 */
public class PetDog extends Dog {
    private String name;

    public PetDog() {
        System.out.println("petDog  构造");
    }

    /**
     * super 代指父类对象
     * super()方法调用父类方法
     *
     * @param color
     * @param name
     */



    public PetDog(String color,String name) {
        super(color);
        this.name = name;
    }


    public void bath(){
        System.out.println("bath");
    }
}
