package cn.Jam._1_introduction.quack.impl;

import cn.Jam._1_introduction.quack.QuackBehavior;

/**
 * 实际上是吱吱叫
 *
 * @author Jam
 * @date 2019/7/28
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱吱~");
    }
}
