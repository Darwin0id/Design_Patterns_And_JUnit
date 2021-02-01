package hr.darwin.view;

import hr.darwin.model.Train;
import hr.darwin.model.impl.*;
import hr.darwin.proxy.TrainProxy;

public class TrainView {
    public void fillTrain(Train trainType) throws Exception {

        System.out.println("============================================================================");

        //ZAPOSLENICI
        Worker employee1 = new Worker.Builder("Matija Kolaric").withSalaryPercentage(0.1).build();
        Worker employee2 = new Worker.Builder("Pero Peric").withSalaryPercentage(0.11).build();

        //DODAVANJE VOZILA
        TrainProxy train = new TrainProxy(trainType);
        train.enter(new Car(EnumEngine.ELECTRICAL), employee1);
        train.enter(new Car(EnumEngine.GAS), employee1);
        train.enter(new Bus(EnumEngine.GAS), employee1);
        train.enter(new Truck(EnumEngine.GAS), employee1);
        train.enter(new Van(EnumEngine.GAS), employee1);

        train.enter(new Car(EnumEngine.GAS), employee2);
        train.enter(new Car(EnumEngine.GAS), employee2);
        train.enter(new Car(EnumEngine.ELECTRICAL), employee2);

        //ZARADA ZAPOSLENIKA
        System.out.println("Zarada zaposlenika {"+employee1.toString()+"}: "+employee1.getSalary()+" HRK");
        System.out.println("Zarada zaposlenika {"+employee2.toString()+"}: "+employee2.getSalary()+" HRK");

        System.out.println("============================================================================");
    }
}
