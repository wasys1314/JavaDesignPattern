package factory;

import factory.abstractFactory.AbstractFactory;
import factory.abstractFactory.ColorFactory;
import factory.abstractFactory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
