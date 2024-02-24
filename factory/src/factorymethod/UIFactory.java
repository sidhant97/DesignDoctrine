package factorymethod;

import factorymethod.UIComponentFactory.AndroidUIComponentFactory;
import factorymethod.UIComponentFactory.IOSUIComponentFactory;
import factorymethod.UIComponentFactory.UIComponentFactory;

public class UIFactory {
    public static UIComponentFactory decideFactory(String platform) {
        if (platform.equals(PlatformEnum.ANDROID.name())) {
            return new AndroidUIComponentFactory();
        } else if (platform.equals(PlatformEnum.WEB.name())) {
            return null;
        } else return new IOSUIComponentFactory();
    }
}
