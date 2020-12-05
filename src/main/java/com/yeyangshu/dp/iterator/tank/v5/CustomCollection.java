package com.yeyangshu.dp.iterator.tank.v5;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/12/5 22:46
 */
public interface CustomCollection {

    void add(Object o);

    int size();

    CustomIterator iterator();

}
