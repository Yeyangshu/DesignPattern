package com.yeyangshu.dp.iterator.tank.v6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/12/5 22:56
 */
public class Client {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i < 15; i++) {
            c.add(new String("s" + i));
        }

        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
