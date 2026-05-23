package creational.builder.builders;

import creational.builder.cars.CarType;
import creational.builder.cars.Car;
import creational.builder.components.Engine;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult() {
        return new Car(type, seats, engine);
    }
}