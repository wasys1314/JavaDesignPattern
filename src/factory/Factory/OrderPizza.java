package factory.Factory;

import factory.Pizza;

/**
 * 工厂方法模式
 * 定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。
 *
 */
public abstract class OrderPizza {
    abstract Pizza createPizza(String orderType);
}
