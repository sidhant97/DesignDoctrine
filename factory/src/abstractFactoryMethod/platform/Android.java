package abstractFactoryMethod.platform;

import abstractFactoryMethod.PlatformEnum;

public class Android extends Platform {
    @Override
    public void setTheme() {
        System.out.println("Welcome to Android.");
    }

    @Override
    public String getPlatform() {
        return PlatformEnum.ANDROID.name();
    }


}
