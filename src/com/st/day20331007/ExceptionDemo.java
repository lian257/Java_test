package com.st.day20331007;

/**
 * @project JavaProjectWorkSpace
 * @description error
 * @author HuShuangFu
 * @date 2023/10/7 16:23:03
 * @version 1.0
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        // 抛出异常如果不处理程序结束

        int a = 1;
        int b = 0;
        try {
            /**
             * 主动抛出
             */
            if (b == 0) {
                throw new ArithmeticException("注意除数为0");
            }
            int result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("he he");
    }
}
