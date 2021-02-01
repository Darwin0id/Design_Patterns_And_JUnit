package hr.darwin.proxy;

import hr.darwin.model.Employee;
import hr.darwin.model.Train;
import hr.darwin.model.Vehicle;
import hr.darwin.model.impl.AbstractTrain;

public class TrainProxy implements Train {
    private final Train trainGateway;
    private final AbstractTrain train;

    public TrainProxy(Train _train) {
        this.trainGateway = _train;
        this.train = ((AbstractTrain)trainGateway);
    }

    @Override
    public void enter(Vehicle vehicle, Employee employee) throws Exception {
        if(train.getOccupancy() < train.getAvailablePlaces()) {
                if(hasPermissions(vehicle)) {
                    employee.parkVehicle(vehicle);
                    trainGateway.enter(vehicle, employee);
                } else {
                    throw new Exception(vehicle.getClass().getSimpleName()+" ne moze se ukrcati na "+train.getClass().getSimpleName());
                }

        } else {
            System.out.println("Nema dovoljno mjesta");
        }
    }

    @Override
    public boolean hasPermissions(Vehicle vehicle) {
        return trainGateway.hasPermissions(vehicle);
    }
}
