package com.yeyangshu.dp.flyweight.tank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 子弹池，使用的时候从池子取出，改变living，不用新增
 * Java String 就是使用的享元模式
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/30 23:23
 */
public class BulletPool {
    List<Bullet> bullets = new ArrayList<>();

    {
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }

    /**
     * 从子弹池取出没有存活的对象（子弹池没有存活代表没有被使用）
     *
     * @return
     */
    public Bullet getBullet() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            if (!b.living) {
                return b;
            }
        }
        // 子弹池不够，新增子弹
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPool bp = new BulletPool();

        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullet();
            System.out.println(b);
        }
    }

}

/**
 * 子弹
 */
class Bullet{

    /** 子弹唯一id */
    public UUID id = UUID.randomUUID();

    /** 子弹存活状态 */
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                '}';
    }
}
