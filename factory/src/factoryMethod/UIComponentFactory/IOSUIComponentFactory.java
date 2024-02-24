package factoryMethod.UIComponentFactory;

import factoryMethod.components.button.Button;
import factoryMethod.components.button.IOSButton;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
