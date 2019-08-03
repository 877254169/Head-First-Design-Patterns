package cn.Jam._3_decorator.example.component;

/**
 * 综合咖啡
 *
 * @author Jam
 * @date 2019/8/3
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
