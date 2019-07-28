package cn.Jam._1_introduction.quack.impl;

import cn.Jam._1_introduction.quack.QuackBehavior;

/**
 * 真正的嘎嘎叫
 *
 * @author Jam
 * @date 2019/7/28
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("嘎嘎嘎嘎嘎~");
    }

}
