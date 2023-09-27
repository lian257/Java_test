package com.stx.exercise.p6.hushuangfu;

/**
 * @project JavaProjectWorkSpace
 * @description Cycle
 * @author HuShuangFu
 * @date 2023/9/27 15:51:06
 * @version 1.0
 */
public class Cycle extends Shap{
    private double r;

    public Cycle() {
    }

    public Cycle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        // 重写getArea()方法求圆的面积
        return Math.PI * r * r;
    }
}
