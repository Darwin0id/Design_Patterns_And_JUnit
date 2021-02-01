package hr.darwin.model.impl;

import hr.darwin.factory.EngineFactory;
import hr.darwin.model.Vehicle;

public class Truck extends AbstractVehicle implements Vehicle {
    private static final int price = 90;
    private static EngineFactory engineFactory = new EngineFactory();

    public Truck() {
        super(price, engineFactory.getEngine(EnumEngine.GAS));
    }

    public Truck(EnumEngine power) {
        super(price, engineFactory.getEngine(power));
    }

    @Override
    public String getEngineInformation() {
        return this.powerStatus.getClass().getSimpleName();
    }

    @Override
    public int getEngineStatus() {
        return this.powerStatus.getPowerStatus();
    }

    @Override
    public void updateEngineStatus(int power) {
        this.powerStatus.updatePowerStatus(power);
    }
}
