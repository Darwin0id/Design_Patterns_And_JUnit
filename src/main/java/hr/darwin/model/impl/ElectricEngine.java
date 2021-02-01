package hr.darwin.model.impl;

import hr.darwin.model.Engine;

import java.util.Random;

public class ElectricEngine extends AbstractEngine implements Engine {
    public ElectricEngine() {
        this.setPowerStatus();
    }

    @Override
    public void setPowerStatus() {
        this.powerStatus = new Random().nextInt(100)+1;
    }

    @Override
    public int getPowerStatus() {
        return this.powerStatus;
    }

    @Override
    public void updatePowerStatus(int newStatus) {
        this.powerStatus = newStatus;
    }

    @Override
    public String toString() {
        return String.valueOf(this.powerStatus);
    }
}
