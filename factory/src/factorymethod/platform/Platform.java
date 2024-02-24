package factorymethod.platform;

import factorymethod.UIComponentFactory.UIComponentFactory;
import factorymethod.UIFactory;

public abstract class Platform {
    public abstract void setTheme();

    public abstract String getPlatform();

    public UIComponentFactory getUIComponentFactory(String platFrom) {
        return UIFactory.decideFactory(platFrom);
    }

}
