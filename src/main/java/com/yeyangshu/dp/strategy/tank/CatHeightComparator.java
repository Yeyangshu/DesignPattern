package com.yeyangshu.dp.strategy.tank;

import java.util.Comparator;

public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o2.height, o1.height);
    }
}
