package creational.factorymethod.factory;

import creational.factorymethod.buttons.Button;
import creational.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}