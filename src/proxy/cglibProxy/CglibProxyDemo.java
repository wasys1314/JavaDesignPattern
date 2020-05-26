package proxy.cglibProxy;

import proxy.staticProxy.BuyHouse;
import proxy.staticProxy.BuyHouseImpl;

public class CglibProxyDemo {
    public static void main(String[] args){
        BuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
        buyHouseCglibProxy.buyHosue();
    }

}
