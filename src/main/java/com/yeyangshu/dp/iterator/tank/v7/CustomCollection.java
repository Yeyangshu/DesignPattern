package com.yeyangshu.dp.iterator.tank.v7;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/12/5 22:46
 */
public interface CustomCollection<E> {

    void add(E o);

    int size();

    CustomIterator iterator();

}
