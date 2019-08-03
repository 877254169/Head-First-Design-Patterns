package cn.Jam._3_decorator.example.decorator.extend;

import cn.Jam._3_decorator.example.component.Beverage;
import cn.Jam._3_decorator.example.decorator.CondimentDecorator;

/**
 * 奶泡
 *
 * @author Jam
 * @date 2019/8/3
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
