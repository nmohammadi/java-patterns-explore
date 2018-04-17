package tiba.design_patterns.bridge;

public class SimpleSensor extends Sensor<ISensor> {
    public SimpleSensor(ISensor sensor) {
        super(sensor);
    }
}
