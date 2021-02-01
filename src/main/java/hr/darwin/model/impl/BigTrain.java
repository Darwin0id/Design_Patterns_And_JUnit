package hr.darwin.model.impl;

import hr.darwin.model.Employee;
import hr.darwin.model.Train;
import hr.darwin.model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigTrain extends AbstractTrain implements Train {
    private static final int numOfPlaces = 8;
    private static final List<Object> permittedObjects = new ArrayList<>(Arrays.asList(new Bus(), new Van()));

    public BigTrain() {
        super(numOfPlaces);
    }

    @Override
    public void enter(Vehicle vehicle, Employee employee) {
        listOfVehicles.add(vehicle);
        System.out.println("Dodano je vozilo: "+vehicle.getClass().getSimpleName()+" s pogonom: "+vehicle.getEngineInformation()+",zaposlenik: "+employee.toString());
    }

    @Override
    public boolean hasPermissions(Vehicle vehicle) {
        for (Object type : permittedObjects) {
            if (type.getClass() == vehicle.getClass()) {
                return true;
            }
        }
        return false;
    }
}
