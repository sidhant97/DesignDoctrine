package abstractFactoryMethod.UIComponentFactory;

import abstractFactoryMethod.components.button.Button;
import abstractFactoryMethod.components.button.IOSButton;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
