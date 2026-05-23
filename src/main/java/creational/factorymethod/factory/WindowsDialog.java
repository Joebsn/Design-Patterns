package creational.factorymethod.factory;

import creational.factorymethod.buttons.Button;
import creational.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}