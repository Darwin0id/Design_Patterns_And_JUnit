package hr.darwin.factory;

import hr.darwin.model.Engine;
import hr.darwin.model.impl.ElectricEngine;
import hr.darwin.model.impl.EnumEngine;
import hr.darwin.model.impl.GasEngine;

public class EngineFactory {
    public Engine getEngine(EnumEngine engineType){
        if(engineType == null){
            return null;
        }
        if(engineType.equals(engineType.ELECTRICAL)){
            return new ElectricEngine();

        } else if(engineType.equals(engineType.GAS)){
            return new GasEngine();
        }

        return null;
    }
}
