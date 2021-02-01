package hr.darwin.factory;

import hr.darwin.model.Train;
import hr.darwin.model.impl.BigTrain;
import hr.darwin.model.impl.EnumTrain;
import hr.darwin.model.impl.SmallTrain;

public class TrainFactory {
    public Train getTrain(EnumTrain trainType){
        if(trainType == null){
            return null;
        }
        if(trainType.equals(EnumTrain.BIG)){
            return new BigTrain();

        } else if(trainType.equals(EnumTrain.SMALL)){
            return new SmallTrain();
        }

        return null;
    }
}
