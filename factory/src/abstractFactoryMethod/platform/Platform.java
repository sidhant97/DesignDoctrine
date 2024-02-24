package abstractFactoryMethod.platform;

import abstractFactoryMethod.UIComponentFactory.UIComponentFactory;
import abstractFactoryMethod.UIFactory;

public abstract class Platform {
    public abstract void setTheme();

    public abstract String getPlatform();

    public UIComponentFactory getUIComponentFactory(String platFrom) {
        return UIFactory.decideFactory(platFrom);
    }

}
