package com.yeyangshu.dp.composite.tank;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/30 23:22
 */
public class Client {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node r1 = new LeafNode("r1");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c21");
        Node c212 = new LeafNode("c22");

        root.add(chapter1);
        root.add(chapter2);
        root.add(r1);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        tree(root, 0);

    }

    /**
     * root
     * --chapter1
     * ----c11
     * ----c12
     * --chapter2
     * ----section21
     * ------c21
     * ------c22
     * --r1
     */

    /**
     * 递归函数
     *
     * @param b 节点
     * @param depth 节点深度
     */
    static void tree(Node b, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        b.print();

        if (b instanceof BranchNode) {
            for (Node n : ((BranchNode) b).nodes) {
                tree(n, depth + 1);
            }
        }
    }

}

/**
 * 抽象节点
 */
abstract class Node {
    public abstract void print();
}

/**
 * 叶子节点
 */
class LeafNode extends Node {
    String context;
    @Override
    public void print() {
        System.out.println(context);
    }

    /**
     * 构造函数
     *
     * @param context
     */
    public LeafNode(String context) {
        this.context = context;
    }
}

/**
 * 分支节点
 */
class BranchNode extends Node {

    /** 节点列表 */
    List<Node> nodes = new ArrayList<>();

    /** 节点名称 */
    String name;

    @Override
    public void print() {
        System.out.println(name);
    }

    /**
     * 添加节点
     *
     * @param node
     */
    public void add(Node node) {
        nodes.add(node);
    }

    /**
     * 构造函数
     *
     * @param name
     */
    public BranchNode(String name) {
        this.name = name;
    }

}
