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
        //��װ����
        add(i);
        System.out.println(i1);
        //�������ʹ����Ǵ�ֵ
        //���������Ǵ���ַ����װ���ͣ�
    }
    public static int add(int value){
        value++;
        return value;
    }



}
