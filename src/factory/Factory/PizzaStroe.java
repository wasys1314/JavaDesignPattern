package factory.Factory;


/**
 * 客户端需要创建类的具体的实例。
 * 简单来说就是用户要订纽约工厂的披萨，他必须去纽约工厂，想订伦敦工厂的披萨，必须去伦敦工厂。
 * 当伦敦工厂和纽约工厂发生变化了，用户也要跟着变化，这无疑就增加了用户的操作复杂性。
 * 为了解决这一问题，我们可以把工厂类抽象为接口，用户只需要去找默认的工厂提出自己的需求（传入参数），
 * 便能得到自己想要产品，而不用根据产品去寻找不同的工厂，方便用户操作。这也就是我们接下来要说的抽象工厂模式。
 */
public class PizzaStroe {

    public static void main(String[] args) {
        OrderPizza mOrderPizza;
        mOrderPizza = new NYOrderPizza();
        mOrderPizza.createPizza("cheese");
    }
}
