package com.stx.exercise.project01.hushunagfu;

/**
 * @project JavaProjectWorkSpace
 * @description 子类
 * @author HuShuangFu
 * @date 2023/9/28 16:34:02
 * @version 1.0
 */
public class IPhone extends Phone{
    public IPhone() {
        this.setBrand("苹果");
    }

    @Override
    public String callMode(){
        return "5G+人像拍照";
    }
}
