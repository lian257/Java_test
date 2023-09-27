package com.ytst.learn;

/**
 * @project JavaProjectWorkSpace
 * @description p
 * @author tlian
 * @date 9/19/2023 16:36:12
 * @version 1.0
 */
public class Phone {
    /**
     * Construct
     * 1.成员变量(代表属性的，一般是名词)
     * 2.成员方法(代表行为的，一般是动词)
     * 语句： 类名  对象名 = new 类名();
     */
    String brand;
    double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //行为
    public void call(){
        System.out.println("calling");
    }
    public void play(){
        System.out.println("playing");
    }

}
