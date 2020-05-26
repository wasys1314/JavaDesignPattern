package factory.SimpleFactory;

import factory.Pizza;

/**
 * 简单工厂模式
 * 定义了一个创建对象的类，由这个类来封装实例化对象的行为。
 * 违背了开闭原则 对扩展打开 对修改关闭
 */
public class SimplePizzaFactory {
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }

}
