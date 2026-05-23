package creational.builder.builders;

import creational.builder.cars.CarType;
import creational.builder.components.Engine;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
}