package factorymethod.platform;

import factorymethod.PlatformEnum;

import java.lang.ref.SoftReference;

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
