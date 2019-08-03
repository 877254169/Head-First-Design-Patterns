package cn.Jam._3_decorator.example.decorator.extend;

import cn.Jam._3_decorator.example.component.Beverage;
import cn.Jam._3_decorator.example.decorator.CondimentDecorator;

/**
 * 摩卡
 *
 * @author Jam
 * @date 2019/8/3
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
