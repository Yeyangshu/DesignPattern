package com.yeyangshu.dp.command.tank;

/**
 * 封装命令
 */
public abstract class Command {
    public abstract void doit(); //exec run

    public abstract void undo();
}