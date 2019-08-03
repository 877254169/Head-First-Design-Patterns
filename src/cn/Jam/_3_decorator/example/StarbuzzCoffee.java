package cn.Jam._3_decorator.example;

import cn.Jam._3_decorator.example.component.Beverage;
import cn.Jam._3_decorator.example.component.Espresso;
import cn.Jam._3_decorator.example.component.HouseBlend;
import cn.Jam._3_decorator.example.decorator.extend.Mocha;
import cn.Jam._3_decorator.example.decorator.extend.Soy;
import cn.Jam._3_decorator.example.decorator.extend.Whip;

/**
 * 星巴兹咖啡店
 *
 * @author Jam
 * @date 2019/8/3
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
