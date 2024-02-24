package factoryMethod.platform;

import factoryMethod.UIComponentFactory.UIComponentFactory;
import factoryMethod.UIFactory;

public abstract class Platform {
    public abstract void setTheme();

    public abstract String getPlatform();

    public UIComponentFactory getUIComponentFactory(String platFrom) {
        return UIFactory.decideFactory(platFrom);
    }

}
