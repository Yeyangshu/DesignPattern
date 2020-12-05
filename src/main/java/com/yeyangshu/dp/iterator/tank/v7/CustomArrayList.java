package com.yeyangshu.dp.iterator.tank.v7;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/12/5 22:47
 */
public class CustomArrayList<E> implements CustomCollection<E> {
    /** 初始化容量为10 */
    E[] objects = (E[])new Object[10];

    /** 指示下一个空位置，或元素个数 */
    private int index = 0;

    /**
     * 添加元素
     *
     * @param object
     */
    @Override
    public void add(E object) {
        if (index == objects.length) {
            // 进行扩容，扩容为原来的两倍
            E[] newObjects = (E[]) new Object[objects.length * 2];
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

    @Override
    public CustomIterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements CustomIterator {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= index) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            E o = objects[currentIndex];
            currentIndex++;
            return o;
        }
    }
}
