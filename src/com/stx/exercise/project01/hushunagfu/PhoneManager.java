package com.stx.exercise.project01.hushunagfu;

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
            System.out.println("1.新增手机 "+ "\t\t" +
                    "2.查询手机 "+ "\t\t" +
                    "3.修改手机 "+ "\t\t" +
                    "4.删除手机");
            System.out.print("请选择您要使用的功能：");
            String choose = scanner.nextLine();
            //测评系统主要逻辑
            switch (choose) {
                case "1":{
                    addPhone();
                    break;
                }
                case "2":{
                    viewPhone();
                    break;
                }
                case "3":{
                    modifyPhone();
                    break;
                }
                case "4":{
                    deletePhone();
                    break;
                }
                case "5":{
                    isExit = true;
                    break;
                }
                default :
                    System.out.println("无效的选择，请重新输入。");
            }
        } while (!isExit);
    }
    /**
     * 新增手机
     */
    private void addPhone(){
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
                    //直接返回主菜单
                    return;
                }

                default:
                    System.out.println("unknown");
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
        System.out.println("编号"+ "\t\t\t" + "品牌"+ "\t\t\t" +
                        "型号"+ "\t\t\t" + "颜色"+ "\t\t\t" +
                        "价格" + "\t\t\t" + "芯片"+ "\t\t\t" +"特点"
                );
        //打印全部手机信息
        for (Phone phone : phones) {
            if (phone != null) {
                System.out.println(phone.getPhoneNo()+ "\t" +
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

            if (searchInput.equalsIgnoreCase("返回")) {
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

                    System.out.print("请输入新的手机价格: ");
                    double newPrice = scanner.nextDouble();
                    phone.setPrice(newPrice);
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

            if (searchInput.equalsIgnoreCase("返回")) {
                return; // 用户输入返回，直接返回上级菜单
            }

            // 遍历phones数组，查找匹配的手机对象
            for (int i = 0; i < phones.length; i++) {
                Phone phone = phones[i];
                if (phone != null && phone.getPhoneNo().equalsIgnoreCase(searchInput)) {
                    // 找到匹配的手机，执行删除操作
                    phones[i] = null;
                    // 删除手机对象
                    System.out.println("删除成功！");
                    found = true;
                    // 删除成功后，设置found为true退出循环
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

    public boolean addNewPhone(Phone phone){
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

        System.out.print("请输入您要新增的手机价格: ");
        double price = scanner.nextDouble();
        phone.setPrice(price);
        scanner.nextLine();   //清除空字符

        System.out.print("请输入您要新增的手机芯片: ");
        String chip = scanner.nextLine();
        phone.setChip(chip);

        System.out.println("提示：" + phone.getBrand() + version + "新增成功");

        for (int i = 0; i < phones.length; i++) {
            if(phones[i]==null){
                phones[i]= phone;
                // 添加成功后返回true
                return true;
            }
        }
        System.out.println("没有足够多的位置");
        return false;
        // 如果数组已满，返回false表示添加失败
    }
}
