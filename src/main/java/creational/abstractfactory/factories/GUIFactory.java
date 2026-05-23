package creational.abstractfactory.factories;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}