package cn.Jam._3_decorator.example.decorator.extend;

import cn.Jam._3_decorator.example.component.Beverage;
import cn.Jam._3_decorator.example.decorator.CondimentDecorator;

/**
 * 豆浆
 *
 * @author Jam
 * @date 2019/8/3
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
