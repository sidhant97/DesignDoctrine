package factorymethod;

import factorymethod.UIComponentFactory.UIComponentFactory;
import factorymethod.platform.Android;
import factorymethod.platform.IOS;
import factorymethod.platform.Platform;

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
