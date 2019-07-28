package cn.Jam._1_introduction.quack.impl;

import cn.Jam._1_introduction.quack.QuackBehavior;

/**
 * 实际不能嘎嘎叫
 *
 * @author Jam
 * @date 2019/7/28
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("嘘~~~~~");
    }
}
