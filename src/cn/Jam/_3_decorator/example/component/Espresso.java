package cn.Jam._3_decorator.example.component;

/**
 * 浓咖啡
 *
 * @author Jam
 * @date 2019/8/3
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
