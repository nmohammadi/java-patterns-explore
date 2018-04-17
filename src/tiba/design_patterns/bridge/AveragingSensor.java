package tiba.design_patterns.bridge;

public class AveragingSensor extends Sensor<ISensor> implements  IAveragingSensor {
    private boolean averagingStarted=false;
    private float average;

    public AveragingSensor(ISensor sensor) {
        super(sensor);
    }

    @Override
    public float getValue() {
        float v = super.getValue();
        if(averagingStarted) {
            average = (average + v) / 2;
            return average;
        }
        return v;
    }

    public void beginAveraging(){
        System.out.println(sensor.getClass().getName()+" begins averaging...");
        averagingStarted=true;
        this.average = this.getValue();
    }
}
