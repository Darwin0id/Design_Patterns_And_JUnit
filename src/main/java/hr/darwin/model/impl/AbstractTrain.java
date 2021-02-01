package hr.darwin.model.impl;

import hr.darwin.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTrain {
    protected int availablePlaces;
    protected final List<Vehicle> listOfVehicles;

    public int getAvailablePlaces() { return availablePlaces; }
    public int getOccupancy() { return listOfVehicles.size(); }

    public AbstractTrain(int places) {
        this.availablePlaces = places;
        listOfVehicles = new ArrayList<>();
    }
}
