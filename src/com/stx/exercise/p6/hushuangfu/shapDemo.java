package com.stx.exercise.p6.hushuangfu;

/**
 * @project JavaProjectWorkSpace
 * @description shapDemo
 * @author HuShuangFu
 * @date 2023/9/27 15:58:39
 * @version 1.0
 */
public class shapDemo {
    public static void main(String[] args) {
        Shap shap = new Cycle(5.0);
        Shap shap1 = new Rectangle(4.0, 6.0);

        // 计算并打印圆和矩形的面积
        System.out.println("圆的面积：" + getShapArea(shap));
        System.out.println("矩形的面积：" + getShapArea(shap1));

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
