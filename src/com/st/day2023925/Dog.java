package com.st.day2023925;

/**
 * @project JavaProjectWorkSpace
 * @description dog
 * @author HuShuangFu
 * @date 2023/9/25 15:11:35
 * @version 1.0
 */
public class Dog {
    private String name = "小七";
    //代码块初始化
    {
        System.out.println(name);
        name = "小灰";
        System.out.println("代码块初始化" + "  "+ name);
    }
    private String sex;
    private String color;
    private String type;
    private int age;
    /**
     * 静态变量（类变量），是类的所有实例共享的，任何实例修改静态变量，修改的是同一份
     */
    
    static int LEGS = 4;

    public Dog() {
    }

    public Dog(String name) {
        // 构造方法初始化
        this("小l","menal","白色","哈士奇",7);
        System.out.println("构造方法初始化" + name);
    }

    public Dog(String name, String sex, String color, String type, int age) {
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLegs(int l) {
        LEGS = l;
    }

    public int getLegs() {
        return LEGS;
    }

    public static void printLegs() {
        System.out.println(LEGS);
    }

    /**
     * 静态方法，是类的公共方法，不某个具体的对象
     * 静态不能直接调用实例
     */
}
