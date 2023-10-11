package com.stx.exercise.project01.hushunagfu;

/**
 * @project JavaProjectWorkSpace
 * @description 子类
 * @author HuShuangFu
 * @date 2023/9/28 16:34:33
 * @version 1.0
 */
public class HuaWeiPhone extends Phone{
    public HuaWeiPhone() {
        super.setBrand("华为");
    }

    @Override
    public String callMode(){
        return "5G+卫星通话";
    }
}
