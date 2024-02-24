package factoryMethod.UIComponentFactory;

import factoryMethod.components.button.AndroidButton;
import factoryMethod.components.button.Button;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
