package creational.abstractfactory;

import creational.abstractfactory.factories.MacOSFactory;
import creational.abstractfactory.factories.WindowsFactory;
import creational.abstractfactory.factories.GUIFactory;
import creational.abstractfactory.app.Application;

public class Demo {

    private static Application configureApplication() {
        GUIFactory factory;
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}