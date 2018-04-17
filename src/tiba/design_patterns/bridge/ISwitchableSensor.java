package tiba.design_patterns.bridge;

public interface ISwitchableSensor extends ISensor {
    void SwitchOn();
    void SwitchOff();
    boolean isSwitchedOn();
}
