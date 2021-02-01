package hr.darwin;

import hr.darwin.controller.TrainController;
import hr.darwin.factory.TrainFactory;
import hr.darwin.model.Train;
import hr.darwin.model.impl.EnumTrain;
import hr.darwin.view.TrainView;

public class Solid {
    private static TrainFactory trainFactory = new TrainFactory();

    public static void main(String[] args) {
        try {
            //PREPARE
            TrainView view = new TrainView();
            Train model = trainFactory.getTrain(EnumTrain.SMALL);

            //SEND TO CONTROLLER
            TrainController controller = new TrainController(model, view);

            //PREVIEW
            controller.printView();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
