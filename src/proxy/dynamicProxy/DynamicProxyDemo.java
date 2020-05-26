package proxy.dynamicProxy;

import proxy.staticProxy.BuyHouse;
import proxy.staticProxy.BuyHouseImpl;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxyDemo {

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new
                Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHosue();
    }

}
