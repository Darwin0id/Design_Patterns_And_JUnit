package hr.darwin.model.impl;

import hr.darwin.model.Employee;
import hr.darwin.model.Vehicle;

public class Worker implements Employee {
    //PROPS
    private double precentage;
    private String fullName;
    private double salary;

    public double getSalary() {
        return salary;
    }

    //PUBLIC
    public Worker(String fullName, double precentage) {
        this.fullName = fullName;
        this.precentage = precentage;
    }

    //PRIVATE
    private Worker() {

    }

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        int powerStatus = vehicle.getEngineStatus();
        System.out.println("Vozilo je napunjeno: "+powerStatus);
        if(powerStatus < 10) {
            System.out.println("Punim vozilo");
            vehicle.updateEngineStatus(100);
        }
        this.salary += ((AbstractVehicle)vehicle).price;
    }

    //BUILDER
    public static class Builder {
        //PROPS
        private String fullName;
        private double precentage;

        public Builder(String fullName) {
            this.fullName = fullName;
        }

        public Builder withSalaryPercentage(double salary) {
            this.precentage = precentage;
            return this;
        }

        public Worker build() {
            Worker worker = new Worker();
            worker.fullName = this.fullName;
            worker.precentage = this.precentage;
            return worker;
        }
    }
}
