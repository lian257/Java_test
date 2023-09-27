package com.st.day2023925;

/**
 * @project JavaProjectWorkSpace
 * @description test
 * @author HuShuangFu
 * @date 2023/9/25 21:52:38
 * @version 1.0
 */
public class GoodsDemo {
    public static void main(String[] args) {
        Goods[] array = new Goods[3];

        Goods g1 = new Goods("001","xiaomi",999.99,100);
        Goods g2 = new Goods();

        array[0] = g1;
        System.out.println(array[0]);

    }
}
