package hr.darwin.model.impl;

import hr.darwin.factory.EngineFactory;
import hr.darwin.model.Vehicle;

public class Van extends AbstractVehicle implements Vehicle {
    private static final int price = 80;
    private static EngineFactory engineFactory = new EngineFactory();

    public Van() {
        super(price, engineFactory.getEngine(EnumEngine.GAS));
    }

    public Van(EnumEngine power) {
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
