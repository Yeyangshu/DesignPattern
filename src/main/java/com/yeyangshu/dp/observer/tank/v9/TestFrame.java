package com.yeyangshu.dp.observer.tank.v9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Java awt自带Frame框架
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 23:56
 */
public class TestFrame extends Frame {

    public static void main(String[] args) {
        new TestFrame().launch();
    }

    /**
     * 点击
     */
    public void launch() {
        Button b = new Button("press me");
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        this.add(b);
        this.pack();

        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    /**
     * 监听器1
     */
    class MyActionListener implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e 事件
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed 1!");
        }
    }

    /**
     * 监听器2
     */
    class MyActionListener2 implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e 事件
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed 2!");
        }
    }

}
