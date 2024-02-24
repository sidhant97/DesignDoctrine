package factorymethod.UIComponentFactory;

import factorymethod.components.button.AndroidButton;
import factorymethod.components.button.Button;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
