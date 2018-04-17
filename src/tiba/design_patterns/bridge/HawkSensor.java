package tiba.design_patterns.bridge;

public class HawkSensor implements ISwitchableSensor {
    private boolean isSwitchedOn =false;

    @Override
    public void SwitchOn() {
        isSwitchedOn=true;
    }

    @Override
    public void SwitchOff() {
        isSwitchedOn=false;
    }

    @Override
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    @Override
    public float getValue() {
        if(!isSwitchedOn) return 0;
        return 7;
    }
}
