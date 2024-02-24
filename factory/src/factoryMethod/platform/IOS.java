package factoryMethod.platform;

import factoryMethod.PlatformEnum;

public class IOS extends Platform {
    @Override
    public void setTheme() {
        System.out.println("Welcome to IOS.");
    }

    @Override
    public String getPlatform() {
        return PlatformEnum.IOS.name();
    }
}
