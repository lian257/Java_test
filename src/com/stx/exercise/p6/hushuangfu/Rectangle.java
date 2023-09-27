package com.stx.exercise.p6.hushuangfu;

/**
 * @project JavaProjectWorkSpace
 * @description Rectangle
 * @author HuShuangFu
 * @date 2023/9/27 15:56:10
 * @version 1.0
 */
public class Rectangle extends Shap{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 重写getArea()方法求矩形的面积
     */
    @Override
    public double getArea() {
        return length * width;
    }
}
