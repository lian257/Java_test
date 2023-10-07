package com.st.day2033928.anime;

/**
 * @project JavaProjectWorkSpace
 * @description animal test
 * @author HuShuangFu
 * @date 2023/9/28 15:10:08
 * @version 1.0
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Sheep();

        for (int i = 0; i < animals.length -1; i++) {
            animals[i].crow();
        }
    }
}
