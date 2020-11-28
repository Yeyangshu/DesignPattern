package com.yeyangshu.dp.strategy.tank;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 10:37
 */
public class Dog implements Comparable<Dog> {

    /** 饭量 */
    int food;

    /**
     *
     * @param dog
     * @return
     */
    @Override
    public int compareTo(Dog dog) {
        if (this.food < dog.food) {
            return -1;
        } else if (this.food > dog.food) {
            return 1;
        } else {
            return 0;
        }
    }

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
