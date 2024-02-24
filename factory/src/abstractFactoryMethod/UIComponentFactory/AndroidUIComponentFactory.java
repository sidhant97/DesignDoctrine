package abstractFactoryMethod.UIComponentFactory;

import abstractFactoryMethod.components.button.AndroidButton;
import abstractFactoryMethod.components.button.Button;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
