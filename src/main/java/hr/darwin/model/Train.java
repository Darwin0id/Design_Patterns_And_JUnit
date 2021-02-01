package hr.darwin.model;

public interface Train {
    void enter(Vehicle vehicle, Employee employee) throws Exception;
    boolean hasPermissions(Vehicle vehicle);
}
