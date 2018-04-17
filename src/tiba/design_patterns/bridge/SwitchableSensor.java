package tiba.design_patterns.bridge;

public class SwitchableSensor extends Sensor<ISwitchableSensor> implements ISwitchableSensor {

    public SwitchableSensor(ISwitchableSensor sensor) {
        super(sensor);
    }

    @Override
    public void SwitchOn() {
        if(isSwitchedOn()) return;
        sensor.SwitchOn();
    }

    @Override
    public void SwitchOff() {
        if(!isSwitchedOn()) return;
        sensor.SwitchOff();
    }

    @Override
    public boolean isSwitchedOn() {
        return sensor.isSwitchedOn();
    }
}
