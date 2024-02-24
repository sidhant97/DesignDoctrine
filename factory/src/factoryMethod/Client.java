package factoryMethod;

import factoryMethod.UIComponentFactory.UIComponentFactory;
import factoryMethod.platform.Android;
import factoryMethod.platform.IOS;
import factoryMethod.platform.Platform;

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
