package com.stx.exercise.project01.hushunagfu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @project JavaProjectWorkSpace
 * @description Manager system
 * @author HuShuangFu
 * @date 2023/9/28 17:25:09
 * @version 1.0
 */
public class PhoneManager {
    private Phone[] phones;
    Scanner scanner = new Scanner(System.in);

    public Phone[] getPhone() {
        return phones;
    }

    public void setPhone(Phone[] phones) {
        this.phones = phones;
    }
    //开始菜单

    public void start() {
        boolean isExit = false;
        do {
            System.out.println();
            System.out.println("##########'遥遥领先'手机测评系统'##########");
            System.out.println("1.新增手机 " + "\t\t" +
                    "2.查询手机 " + "\t\t" +
                    "3.修改手机 " + "\t\t" +
                    "4.删除手机" + "\t\t" + "5.退出系统");
            System.out.print("请选择您要使用的功能：");
            String choose = scanner.nextLine();
            //测评系统主要逻辑
            switch (choose) {
                case "1": {
                    addPhone();
                    break;
                }
                case "2": {
                    viewPhone();
                    break;
                }
                case "3": {
                    modifyPhone();
                    break;
                }
                case "4": {
                    deletePhone();
                    break;
                }
                case "5": {
                    isExit = true;
                    break;
                }
                default:
                    System.out.println("无效的选择，请重新输入。");
            }
        } while (!isExit);
    }

    /**
     * 新增手机
     */
    private void addPhone() {
        // 占位
        System.out.println();
        System.out.println("##########'新增手机'##########" + "\n" +
                "1.苹果手机" + "\t\t" +
                "2.华为手机" + "\t\t" +
                "3.返回首页"
        );

        boolean validInput = false;
        while (!validInput) {
            System.out.print("请选择您要新增的手机品牌: ");
            String brand = scanner.nextLine();
            switch (brand) {
                case "1": {
                    Phone phone = new IPhone();
                    validInput = addNewPhone(phone);
                    return; // 添加手机成功后直接返回主菜单
                }
                case "2": {
                    Phone phone = new HuaWeiPhone();
                    validInput = addNewPhone(phone);
                    return; // 添加手机成功后直接返回主菜单
                }
                case "3": {
                    validInput = true;
                    //直接返回主菜单
                    return;
                }
                default:
                    System.out.println("输入错误");
            }
        }
    }

    /**
     * 查询手机
     */
    private void viewPhone() {
        // 占位
        System.out.println();
        System.out.println("##########'手机列表'#########");
        System.out.println("编号" + "\t\t\t" + "品牌" + "\t\t\t" +
                "型号" + "\t\t\t" + "颜色" + "\t\t\t" +
                "价格" + "\t\t\t" + "芯片" + "\t\t\t" + "特点"
        );
        //打印全部手机信息
        for (Phone phone : phones) {
            if (phone != null) {
                System.out.println(phone.getPhoneNo() + "\t" +
                        phone.getBrand() + "\t\t\t" +
                        phone.getVersion() + "\t\t" +
                        phone.getColor() + "\t\t\t" +
                        phone.getPrice() + "\t\t" +
                        phone.getChip() + "\t\t\t" +
                        phone.callMode());
            }
        }
    }

    /**
     * 修改手机
     */
    private void modifyPhone() {
        System.out.println();
        System.out.println("########## '修改手机信息' ##########");

        boolean found = false;
        // 用于标记是否找到匹配的手机信息
        System.out.print("请输入要修改的手机编号 : ");
        while (!found) {
            String searchInput = scanner.nextLine();

            if ("返回".equals(searchInput)) {
                return; // 用户输入返回，直接返回上级菜单
            }
            // 遍历phones数组，查找匹配的手机对象
            for (Phone phone : phones) {
                if (phone != null && phone.getPhoneNo().equalsIgnoreCase(searchInput)) {
                    // 找到匹配的手机，允许用户进行修改
                    System.out.println("#########'设置手机相同'#########");
                    System.out.print("请输入新的手机型号: ");
                    String newVersion = scanner.nextLine();
                    phone.setVersion(newVersion);

                    System.out.print("请输入新的手机颜色: ");
                    String newColor = scanner.nextLine();
                    phone.setColor(newColor);

                    // 获取有效的手机价格
                    double price = getValidDoubleInput("请输入新的手机价格: ");
                    phone.setPrice(price);
                    // 设置手机的价格
                    scanner.nextLine(); // 清除空字符

                    System.out.print("请输入新的手机芯片: ");
                    String newChip = scanner.nextLine();
                    phone.setChip(newChip);

                    System.out.println("提示：修改成功");
                    found = true;
                    // 修改成功后，设置found为true退出循环
                    break;
                }
            }
            // 如果没有找到匹配的手机，显示相应的提示信息并重新输入
            if (!found) {
                System.out.print("未查询到该手机编号请重新输入，" +
                        "返回上级请输入返回:");
            }
        }
    }

    /**
     * 删除手机
     */
    private void deletePhone() {
        System.out.println();
        System.out.println("########## '删除手机' ##########");

        boolean found = false;
        // 用于标记是否找到匹配的手机信息
        System.out.print("请选择您要删除的手机编号 : ");
        while (!found) {
            String searchInput = scanner.nextLine();

            if ("返回".equals(searchInput)) {
                return; // 用户输入返回，直接返回上级菜单
            }

            // 遍历phones数组，查找匹配的手机对象
            for (int i = 0; i < phones.length; i++) {
                Phone phone = phones[i];
                if (phone != null && phone.getPhoneNo().equalsIgnoreCase(searchInput) && searchInput.length() == 9) {
                    // 找到匹配的手机，执行删除操作
                    phones[i] = null;
                    // 删除手机对象
                    found = true;
                    // 删除成功后，设置found为true退出循环
                    System.out.println("删除成功");
                    break;
                }
            }

            // 如果没有找到匹配的手机，显示相应的提示信息并重新输入
            if (!found) {
                System.out.print("未查询到该手机编号请重新输入，返回上级请输入返回:");
            }
        }
    }

    /**
     * 静态变量用于自动生成手机编号
     */
    private static int phoneCounter = 2023000;


    public boolean addNewPhone(Phone phone) {
        if (phone == null) {
            return false;
        }
        // 占位
        System.out.println();
        phoneCounter++;
        String phoneNo = "NO" + phoneCounter;
        phone.setPhoneNo(phoneNo);

        System.out.println("############## '设置手机信息' ############");
        System.out.print("请输入您要新增的手机型号: ");
        String version = scanner.nextLine();
        phone.setVersion(version);

        System.out.print("请输入您要新增的手机颜色: ");
        String color = scanner.nextLine();
        phone.setColor(color);

        // 获取有效的手机价格
        double price = getValidDoubleInput("请输入您要新增的手机价格: ");
        phone.setPrice(price);
        // 设置手机的价格

        System.out.print("请输入您要新增的手机芯片: ");
        String chip = scanner.nextLine();
        phone.setChip(chip);

        return resizeArray(phone);
    }

    /**
     * @description 数组扩容
     * @param phone
     * @return boolean
     * @author HuShuangFu
     * @date 2023/10/10 17:27:01
     */

    public boolean resizeArray(Phone phone) {
        // 寻找第一个空闲位置来添加新手机
        int index = -1;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] == null) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // 找到空闲位置，直接添加手机
            phones[index] = phone;
            phone.setPhoneNo("NO" + phoneCounter);
            System.out.println("提示：" + phone.getBrand() + phone.getVersion() + "新增成功");
            return true;
        } else {
            // 数组已满，执行扩容操作
            int newSize = phones.length * 2;
            // 假设每次扩容为原来的两倍
            Phone[] newPhones = new Phone[newSize];

            // 将原数组中的元素复制到新数组中
            for (int i = 0; i < phones.length; i++) {
                newPhones[i] = phones[i];
            }

            // 更新引用指向新数组
            phones = newPhones;

            // 继续尝试添加新元素
            for (int i = 0; i < phones.length; i++) {
                if (phones[i] == null) {
                    phones[i] = phone;
                    return true;
                }
            }

            System.out.println("没有足够多的位置");
            // 如果数组已满且扩容后仍然无法添加，返回false表示添加失败
            return false;
        }
    }

    /***
     * @description 处理价格异常
     * @param prompt
     * @return double
     * @author HuShuangFu
     * @date 2023/10/10 17:07:39
     */

    private double getValidDoubleInput(String prompt) {
        double value = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                value = scanner.nextDouble();
                if (value >= 0) {
                    validInput = true;
                    // 输入有效，跳出循环
                } else {
                    System.out.println("输入值不能为负数，请重新输入一个非负数值。");
                }
            } catch (InputMismatchException e) {
                System.out.println("无效的输入，请重新输入一个有效的 double 类型值。");
                scanner.nextLine();
            }
        }

        scanner.nextLine(); // 清除输入缓冲
        return value;
    }

}
