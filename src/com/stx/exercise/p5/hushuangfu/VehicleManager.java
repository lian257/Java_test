package com.stx.exercise.p5.hushuangfu;

import java.util.Scanner;

/***
 * @description TODO
 * @author HuShuangFu
 * @date 2023/9/25 20:24:53
 */

public class VehicleManager {
    private Vehicle[] vehicleList = new Vehicle[10];
    private Scanner scanner = new Scanner(System.in);

    //构造函数
    public VehicleManager() {
        //初始化10辆共享车放在vehicleList 数组里面

        for (int i = 0; i < 10; i++) {
            String vehicleId = String.format("%02d", i + 1);
            // 创建车辆ID，例如：001, 002, ...
            Vehicle vehicle = new Vehicle(vehicleId, 0);
            // 创建车辆对象，初始里程为0
            vehicleList[i] = vehicle;
            // 将车辆添加到数组
        }

    }


    //开始菜单
    public void start() {

        System.out.println("**************************");
        System.out.println("*******共享车管理系统*******");
        System.out.println("**************************");


        boolean isExit = false;
        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println("***请选择操作：");
            System.out.println("***1.查看车辆");
            System.out.println("***2.租赁车辆");
            System.out.println("***3.归还车辆");
            System.out.println("***4.退出");
            String choose = scanner.nextLine();
            System.out.println("---------------------------------------------------------------");
            // 完善菜单逻辑
            switch (choose) {
                case "1":
                    System.out.println("您选择了查看车辆。");
                    view();

                    break;

                case "2":
                    System.out.println("您选择了租赁车辆。");
                    rental();
                    break;

                case "3":
                    System.out.println("您选择了归还车辆。");
                    back();
                    break;

                case "4":
                    isExit = true;
                    System.out.println("感谢使用，再见！");
                    break;

                default:
                    System.out.println("无效的选择，请重新输入。");
            }


        } while (!isExit);
    }

    private void view() {

        System.out.println("编号\t\t状态\t\t租车说明");
        //打印全部车辆信息 编号，状态，租车说明
        for (int i = 0; i < vehicleList.length; i++) {
            System.out.println(vehicleList[i].getId() +"\t\t"+ (vehicleList[i].getStatus() == 1 ? "已租":"可租") + "\t\t"+ vehicleList[i].showInfo());
        }
    }

    //租车
    private void rental() {
        boolean validInput = false;

        while (!validInput) {
            System.out.println("请输入租车编号：");
            String id = scanner.nextLine();

            for (int i = 0; i < vehicleList.length; i++) {
                if (vehicleList[i].getId().equals(id)) {
                    if (vehicleList[i].getStatus() == 0) {
                        vehicleList[i].setStatus(1);
                        System.out.println("成功租赁车辆：" + vehicleList[i].getId());
                        validInput = true;
                        // 设置为true表示输入有效
                        break;
                        // 找到后结束循环
                    } else {
                        System.out.println("该车辆已经出租，请选择其他车辆。");
                        break;
                        // 找到车辆但已出租，结束循环
                    }
                }
            }
            if (!validInput) {
                System.out.println("没有找到该编号的车辆信息，请重新输入！");
            }
        }
    }

    //还车
    private void back() {
        boolean validInput = false;

        while (!validInput) {
            System.out.println("请输入还车编号：");
            String id = scanner.nextLine();

            for (int i = 0; i < vehicleList.length; i++) {
                if (vehicleList[i].getId().equals(id)) {
                    if (vehicleList[i].getStatus() == 1) {
                        vehicleList[i].setStatus(0);
                        System.out.println("该车辆已还：" + vehicleList[i].getId());
                        validInput = true;
                        break;
                    } else {
                        System.out.println("该车辆已还，请选择其他车辆。");
                        break;
                    }
                }
            }

            if (!validInput) {
                System.out.println("没有找到该编号的车辆信息，请重新输入！");
            }
        }
    }
}
