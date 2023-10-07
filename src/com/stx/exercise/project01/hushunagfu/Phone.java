package com.stx.exercise.project01.hushunagfu;

/**
 * @project JavaProjectWorkSpace
 * @description 父类:手机类
 * @author HuShuangFu
 * @date 2023/9/28 16:32:10
 * @version 1.0
 */
public abstract class Phone {
    private String phoneNo;
    private String brand;
    private String version;
    private String color;
    private double price;
    private String chip;
    private int index;

    /**
     *  该方法根据手机种类不同返回不同的字符串
     */
    public abstract String callMode();

    public Phone() {
    }

    public Phone(String phoneNo,String brand,
                 String version, String color,
                 double price, String chip,int index) {
        this.phoneNo = phoneNo;
        this.brand = brand;
        this.version = version;
        this.color = color;
        this.price = price;
        this.chip = chip;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
