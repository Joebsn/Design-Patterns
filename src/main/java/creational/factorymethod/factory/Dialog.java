package creational.factorymethod.factory;

import creational.factorymethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.onClick();
    }

    public abstract Button createButton();
}