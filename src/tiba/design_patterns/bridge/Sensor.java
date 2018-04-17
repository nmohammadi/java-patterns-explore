package tiba.design_patterns.bridge;

public class Sensor<T extends ISensor> implements ISensor{
    protected T sensor;

    public Sensor(T sensor) {
        this.sensor = sensor;
    }

    @Override
    public float getValue() {
        float v = sensor.getValue();
        System.out.println( sensor.getClass().getName()+" sensing "+v);
        return v;
    }
}
