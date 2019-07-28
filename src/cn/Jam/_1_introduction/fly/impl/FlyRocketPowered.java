package cn.Jam._1_introduction.fly.impl;

import cn.Jam._1_introduction.fly.FlyBehavior;

/**
 * 利用火箭动力飞行
 * @author Jam
 * @date 2019/7/28
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("坐着火箭上月球~");
    }
}
