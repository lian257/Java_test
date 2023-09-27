package com.stx.exercise1.p4.threehushuangfu;

/**
 * @project JavaProjectWorkSpace
 * @description 小面类
 * @author HuShuangFu
 * @date 2023/9/25 19:04:21
 * @version 1.0
 */
public class Noodle {
    private String type = "麻辣面";
    private int weight = 2;
    private boolean isHaveSoup = true;

    //无参构造

    public Noodle(){}

    //有参构造

    public Noodle(String type, int weight) {
        this.type = type;
        this.weight = weight;

    }

    public Noodle(String type, int weight, boolean isHaveSoup) {
        this.type = type;
        this.weight = weight;
        this.isHaveSoup = isHaveSoup;
    }

    
    public  Noodle getInstance() {
        return new Noodle();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getIsHaveSoup() {
        return isHaveSoup;
    }

    /**
     * 打印小面的种类，分量，是否带汤用于查看是否符合要求
     */
    public void check(){
//        if(isHaveSoup){
//            System.out.println("小面的种类是："+ this.type+",小面的分量是："+this.weight+"两,带汤");
//        }else{
//            System.out.println("小面的种类是："+ this.type+",小面的分量是："+this.weight+"两，不带汤");
//        }
        System.out.println("小面的种类是："+ this.type+",小面的分量是："+this.weight+ (isHaveSoup?"两,带汤":"两，不带汤"));
    }
}
