package com.stx.exercise1.p2;

import java.util.Scanner;
/**
 * @project JavaProjectWork
 * @description 计算小组平均分的系统
 * @author HuShuangFu
 * @date 2023/9/17 16:13:12
 * @version 1.0
 */
public class Three_HuShuangFu {  
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        while (true) {
            systemDisplays("这是一个计算小组平均分系统", "e 进入系统", "q 退出系统");
            System.out.print("请输入选项（e 进入系统，q 退出系统）: ");
            String userInput = scanner.next();

            if (userInput.equals("e")) {
                // 调用进入系统的方法
                enterSystem(scanner);
            } else if (userInput.equals("q")) {
                // 退出系统的操作
                System.out.println("已退出系统。");
                break; // 退出循环
            } else {
                System.out.println("无效的选项。");
            }
        }

        scanner.close();
    }
    /**
     * @description TODO
     * @param title
     * @param option1
     * @param option2
     * @return void
     * @author HuShuangFu
     * @date 2023/9/18 10:34:49
     */
    public static void systemDisplays(String title, String option1, String option2) {
        // ANSI转义码来改变文本颜色和样式
        String reset = "\u001B[0m";
        // 重置样式
        String bold = "\u001B[1m";
        // 粗体
        String red = "\u001B[31m";
        // 红色文本
        String green = "\u001B[32m";
        // 绿色文本

        System.out.println("=================================");
        System.out.println(bold + red + "   " + title + reset);
        System.out.println("---------------------------------");

        // 计算需要插入的空格数量以将文本居中
        int padding = (26 - option1.length()) / 2;
        String spaces = new String(new char[padding]).replace('\0', ' ');

        // 居中对齐选项文本
        System.out.println(green + spaces + option1 + reset);
        System.out.println(green + spaces + option2 + reset);

        System.out.println("=================================");
    }
    /**
     * @description 处理用户输入
     * @param scanner
     * @return void
     * @date 2023/9/17 14:58:05
     */

    public static void enterSystem(Scanner scanner) {
        System.out.print("请输入小组人数: ");
        int groupSize = scanner.nextInt();

        double[] scores = new double[groupSize];

        for (int i = 0; i < groupSize; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个人分数: ");
            scores[i] = scanner.nextDouble();
        }

        System.out.print("排序后的分数数组是: [");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 计算平均分

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }

        double average = sum / groupSize;
        System.out.println("平均分是: " + average);
        System.out.println();
    }
}

