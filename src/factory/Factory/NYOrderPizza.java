package factory.Factory;

import factory.Pizza;

public class NYOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new NYCheesePizza();
            System.out.println("生成NYCheesePizza");
        } else if (ordertype.equals("pepper")) {
            pizza = new NYPepperPizza();
            System.out.println("生成NYPepperPizza");
        }
        return pizza;

    }

}
