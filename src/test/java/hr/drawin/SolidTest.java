package hr.drawin;

import hr.darwin.factory.TrainFactory;
import hr.darwin.model.Engine;
import hr.darwin.model.Train;
import hr.darwin.model.impl.*;
import hr.darwin.proxy.TrainProxy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SolidTest {

    @Test
    public void shouldReturnTrueIfVehicleCanEnter() {
        //POTREBAN ZAPOSLENIK
        Worker employee1 = new Worker.Builder("Matija Kolaric").withSalaryPercentage(0.1).build();

        //NAPRAVI VLAK
        Train engine =  new TrainFactory().getTrain(EnumTrain.SMALL);

        //EGZIBICIJE
        TrainProxy train = new TrainProxy(engine);

        //POZITIVNI
        Assertions.assertTrue(train.hasPermissions(new Car(EnumEngine.ELECTRICAL)));

        //NEGATIVNI
        //Assertions.assertTrue(train.hasPermissions(new Truck(EnumEngine.ELECTRICAL)));
    }

    @Test
    public void shouldCreateGasCar() {
        Car gasCar = new Car(EnumEngine.GAS);
        Car elCar = new Car((EnumEngine.ELECTRICAL));
        Car original = new Car();

        //POZITIVAN
        Assertions.assertEquals(original,gasCar);

        //NEGATIVAN
        //Assertions.assertEquals(original,elCar);
    }

    @Test
    public void shouldThrowExceptionWhenEnterWrongVehicle() {
        //POTREBAN ZAPOSLENIK
        Worker employee1 = new Worker.Builder("Matija Kolaric").withSalaryPercentage(0.1).build();

        //NAPRAVI VLAK
        Train engine =  new TrainFactory().getTrain(EnumTrain.SMALL);

        //EGZIBICIJE
        TrainProxy train = new TrainProxy(engine);

        //POZITIVNI
        Assertions.assertThrows(Exception.class, () -> train.enter(new Truck(EnumEngine.GAS), employee1));

        //NEGATIVNI
        //Assertions.assertThrows(Exception.class, () -> train.enter(new Car(EnumEngine.GAS), employee1));
    }
}
