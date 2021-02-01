package hr.darwin.model;

public interface Engine {
    void setPowerStatus();
    int getPowerStatus();
    void updatePowerStatus(int newStatus);
}
