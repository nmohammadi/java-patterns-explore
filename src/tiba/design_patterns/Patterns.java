package tiba.design_patterns;

import tiba.design_patterns.bridge.*;
import tiba.design_patterns.decorator.*;

public class Patterns {
    public static void main(String[] args) {
        //bridgeTestDrive();

        decoratorTestDrive();

    }

    private static void decoratorTestDrive() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }

    private static void bridgeTestDrive() {
        ISensor s = new SimpleSensor(new EagleSensor());
        s.getValue();

        IAveragingSensor as = new AveragingSensor(new EagleSensor());
        as.beginAveraging();
        as.getValue();
        as.getValue();

        IAveragingSensor as2 = new AveragingSensor(new HawkSensor());
        as2.beginAveraging();
        as2.getValue();
        as2.getValue();

        ISwitchableSensor ss = new SwitchableSensor(new HawkSensor());
        ss.SwitchOn();
        ss.getValue();
        ss.SwitchOff();
        //ISwitchableSensor ss2 = new SwitchableSensor(new EagleSensor());
    }
}
