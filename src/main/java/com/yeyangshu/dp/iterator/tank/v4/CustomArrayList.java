package com.yeyangshu.dp.iterator.tank.v4;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/12/5 22:47
 */
public class CustomArrayList implements CustomCollection {
    /** 初始化容量为10 */
    Object[] objects = new Object[10];

    /** 指示下一个空位置，或元素个数 */
    private int index = 0;

    /**
     * 添加元素
     *
     * @param object
     */
    @Override
    public void add(Object object) {
        if (index == objects.length) {
            // 进行扩容，扩容为原来的两倍
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        // 赋值
        objects[index] = object;
        // 更新下标
        index++;
    }

    /**
     * 容器元素个数
     */
    @Override
    public int size() {
        return index;
    }
}
