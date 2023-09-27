package com.ytst.learn;

/**
 * @project JavaProjectWorkSpace
 * @description 冒泡
 * @author HuShuangFu
 * @date 2023/9/21 14:24:14
 * @version 1.0
 */
public class ArrsyDemo {
    public static void main(String[] args){
        int [] a = {2,5,1,7,8};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i -1; j++) {
                if(a[j] > a[j + 1]) {
                    // 交换相邻元素
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
        for (int i1 = 0; i1 < a.length; i1++) {
            System.out.printf(a[i1] + " ");
        }

    }
}

/**
 * 项目描述:脑电波辅助起身椅
 * 下肢功能障碍一直是困扰很多人的问题。
 * 本项通过机械与传感器，电机控制帮助下肢功能障碍者起身
 */

