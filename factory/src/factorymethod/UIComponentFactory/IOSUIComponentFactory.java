package factorymethod.UIComponentFactory;

import factorymethod.components.button.Button;
import factorymethod.components.button.IOSButton;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
