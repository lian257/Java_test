package com.ytst.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @project JavaProjectWorkSpace
 * @description 数组冒泡
 * @author HuShuangFu
 * @date 2023/9/14 17:25:18
 * @version 1.0
 */
public class BobSort {
    public static void main(String[] args) {
        // 数组静态初始化
        // 完整格式 ： 数据类型 [] 数组名 = new 数据类型[] {元素1，元素2...};
        int[] arrayComp = new int[]{1, 2, 3, 4};
        int[] array = {1, 2, 3};
        // 简写模式
        System.out.println(array);
        System.out.println("hello");
        /*
         * 控制台输出为 [I@2d98a335
         * [ 表示为数组
         * I 表示为数据类型
         * @ 表示间隔符 固定格式
         * 2d98a335 数组地址
         */
        System.out.println(array[1]);
        // 改变数组某个数据，改变后 原来的数据不存在
        array[1] = 4;

        System.out.println(array[1]);
        System.out.println("array = {1,2,3}：");

        for (int k : array) {
            System.out.println(k);
        }
        /*
         * ieda 添加了快捷遍历
         * 数组名.fori
         * 动态初始化
         * 数据类型 [] 数组名 = new 数据类型[数据长度]
         * 指定数组长度，由jvm给出初始值
         * 引用数据类型：默认初始值null
         * 字符：'\u0000'
         */

        //数据交换
        int[] swapArray = {1, 2, 3, 4, 5};
        for (int i = 0, j = swapArray.length -1; i < j; i++, j--) {
            int temp = swapArray[i];
            swapArray[i] = swapArray[j];
            swapArray[j] = temp;
        }
        for (int j : swapArray) {
            System.out.print(j + " ");
        }

        /**
         * 数组随机打乱
         * 如何获取随机索引
         * 索引范围
         */

        int [] randomArry = {1,2,3,4};
        Random ra = new Random();
        for (int i = 0; i < randomArry.length; i++) {
            int randomindex = ra.nextInt(randomArry.length);

            int atemp = randomArry[i];
            randomArry[i] = randomArry[randomindex];
            randomArry[randomindex] = atemp;
        }
        System.out.println();
        // foreach 循环 循环变量是元素值
        for (int j : randomArry) {
            System.out.print(j + " ");
        }


        int [] rIndex = new int[100];
        Arrays.fill(rIndex,1);
        System.out.println("rIndex :" + rIndex[99]);

        ArrayList rList = new ArrayList();
        rList.add(3);
        System.out.println("rList :" + rList);

        int [][] count = new int[2][3];
        for (int i = 0; i< 2; i++) {
            for(int j = 0; j< 3; j++) {
                count[i][j] = 1;
            }
        }
        for (int i = 0; i< 2; i++) {
            for(int j = 0; j< 3; j++) {
                System.out.print(count[i][j]);
            }
        }
        String str = new String("abcd");
        String str1 = "hello world";

    }
    public static int [] extendArry(int [] array,int length) {
        if(array == null || length == 0){
            return null;
        }
        return new int[array.length];
    }
    int []array = new int[]{1,2,3,4,5,6,7};

}

