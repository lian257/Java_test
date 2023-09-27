package com.stx.exercise1.p4.threehushuangfu;

/**
 * @project JavaProjectWorkSpace
 * @description 测试Noodle
 * @author HuShuangFu
 * @date 2023/9/25 19:11:09
 * @version 1.0
 */
public class NoodleDemo {
    public static void main(String[] args) {
        Noodle n = new Noodle();
        Noodle n1 = new Noodle("羊肉面",2, true);
        Noodle n2 = new Noodle("羊肉面", 2 );

        n.check();
        n1.check();
        n2.check();

        for(int i = 3;i > 0;i--)
        {
            System.out.println(i);
        }
    }
}
