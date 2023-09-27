package com.stx.exercise1.p3.ThreeHuShuangFu;

/**
 * @project JavaProjectWorkSpace
 * @description 测试Ship类
 * @author HuShuangFu
 * @date 2023/9/20 15:21:18
 * @version 1.0
 */
public class ShipDemo {
    public static void main(String[] args) {
        //对象
        Ship ship = new Ship();
        ship.name = "Merlin";

        Ship ship1 = new Ship();
        ship1.name = "Sunny";

        ship.paddle();
        ship1.paddle();

    }
}
