package com.st.day2023920;

/**
 * @project JavaProjectWorkSpace
 * @description String
 * @author tlian
 * @date 2023/9/20 09:32:58
 * @version 1.0
 */
public class PakgType {
    public static void main(String[] args) {
        int i= 10;
        Integer i1= 10;
        //包装类型
        add(i);
        System.out.println(i1);
        //基本类型传参是传值
        //引用类型是传地址（包装类型）
    }
    public static int add(int value){
        value++;
        return value;
    }



}
