package com.stx.exercise.p6.hushuangfu;

/**
 * @project JavaProjectWorkSpace
 * @description shapDemo
 * @author HuShuangFu
 * @date 2023/9/27 15:58:39
 * @version 1.0
 */
public class ShapDemo {
    public static void main(String[] args) {
        Cycle circle = new Cycle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // 计算并打印圆和矩形的面积
        System.out.println("圆的面积：" + getShapArea(circle));
        System.out.println("矩形的面积：" + getShapArea(rectangle));

    }

    /**
     * 获取任意图形的面积
     * @param shap
     * @return
     */
    public static double getShapArea(Shap shap) {
        return shap.getArea();
    }
}
