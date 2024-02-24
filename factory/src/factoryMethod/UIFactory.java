package factoryMethod;

import factoryMethod.UIComponentFactory.AndroidUIComponentFactory;
import factoryMethod.UIComponentFactory.IOSUIComponentFactory;
import factoryMethod.UIComponentFactory.UIComponentFactory;

public class UIFactory {
    public static UIComponentFactory decideFactory(String platform) {
        if (platform.equals(PlatformEnum.ANDROID.name())) {
            return new AndroidUIComponentFactory();
        } else if (platform.equals(PlatformEnum.WEB.name())) {
            return null;
        } else return new IOSUIComponentFactory();
    }
}
