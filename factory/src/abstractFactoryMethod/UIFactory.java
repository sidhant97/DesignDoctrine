package abstractFactoryMethod;

import abstractFactoryMethod.UIComponentFactory.AndroidUIComponentFactory;
import abstractFactoryMethod.UIComponentFactory.IOSUIComponentFactory;
import abstractFactoryMethod.UIComponentFactory.UIComponentFactory;

public class UIFactory {
    public static UIComponentFactory decideFactory(String platform) {
        if (platform.equals(PlatformEnum.ANDROID.name())) {
            return new AndroidUIComponentFactory();
        } else if (platform.equals(PlatformEnum.WEB.name())) {
            return null;
        } else return new IOSUIComponentFactory();
    }
}
