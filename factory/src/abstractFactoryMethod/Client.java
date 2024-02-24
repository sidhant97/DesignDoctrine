package abstractFactoryMethod;

import abstractFactoryMethod.UIComponentFactory.UIComponentFactory;
import abstractFactoryMethod.platform.Android;
import abstractFactoryMethod.platform.IOS;
import abstractFactoryMethod.platform.Platform;

public class Client {
    public static void main(String[] args) {
        Platform platform = new Android();
        UIComponentFactory uiComponentFactory = platform.getUIComponentFactory(platform.getPlatform());
        uiComponentFactory.createButton().click();

        platform = new IOS();
        uiComponentFactory = platform.getUIComponentFactory(platform.getPlatform());
        uiComponentFactory.createButton().click();
    }
}
