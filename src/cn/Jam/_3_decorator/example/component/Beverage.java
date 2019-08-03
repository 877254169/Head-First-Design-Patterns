package cn.Jam._3_decorator.example.component;

/**
 * 饮料超类 被装饰者和装饰器共同的类型
 *
 * @author Jam
 * @date 2019/8/3
 */
public abstract class Beverage {
    /**
     * 描述饮料
     */
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 计算饮料价格
     * @return 饮料价格
     */
    public abstract double cost();
}
