package hr.darwin.controller;

import hr.darwin.model.Train;
import hr.darwin.view.TrainView;

public class TrainController {
    private Train model;
    private TrainView view;

    public TrainController(Train model, TrainView view) {
        this.view = view;
        this.model = model;
    }

    public void printView() throws Exception {
        this.view.fillTrain(this.model);
    }
}
