package com.st.day2033928.anime;

/**
 * @project JavaProjectWorkSpace
 * @description dog
 * @author HuShuangFu
 * @date 2023/9/28 15:05:38
 * @version 1.0
 */
public class Dog extends Animal{
    @Override
    public void crow() {
        System.out.println("U*.*U");
    }




    /**
     * 特有方法
     */

    public void lick() {
        System.out.println("舔狗");
    }
}
