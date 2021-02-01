package hr.darwin.model.impl;

import hr.darwin.model.Engine;

import java.util.Objects;

public class AbstractVehicle {
    public int price;
    public Engine powerStatus;

    public AbstractVehicle(int price, Engine powerStatus) {
        this.price = price;
        this.powerStatus = powerStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractVehicle)) return false;
        AbstractVehicle that = (AbstractVehicle) o;
        return price == that.price &&
                powerStatus.getClass().getSimpleName() == that.powerStatus.getClass().getSimpleName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, powerStatus.getClass().getSimpleName());
    }
}
