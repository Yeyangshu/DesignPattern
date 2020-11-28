package com.yeyangshu.dp.strategy.tank;

import java.util.Comparator;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 10:49
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.food, o2.food);
    }
}
