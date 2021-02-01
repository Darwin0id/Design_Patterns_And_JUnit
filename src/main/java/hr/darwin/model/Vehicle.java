package hr.darwin.model;

public interface Vehicle {
    String getEngineInformation();
    int getEngineStatus();
    void updateEngineStatus(int power);
}

