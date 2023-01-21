package pl.javastart.task.logic;

public abstract class OverclockableComponent extends Component {

    int frequency;
    int temperature;
    int maxTemperature;

    public OverclockableComponent(String name, String producer, String id, int frequency, int temperature, int maxTemperature) {
        super(name, producer, id);
        setFrequency(frequency);
        setTemperature(temperature);
        setMaxTemperature(maxTemperature);
    }

    abstract int getIncreaseTemp();

    public void overclock(int value) {
        int n = value / 100;
        heatingUp(n);
        frequency = frequency + value;
    }

    private void heatingUp(int n) {
        if (isOverheated(n)) {
            throw new OverheatedException("Ryzyko przegrzania");
        }
        temperature = temperature + (getIncreaseTemp() * n);
    }

    private boolean isOverheated(int n) {
        int t = temperature + (n * getIncreaseTemp());
        return t > maxTemperature;
    }

    public void setFrequency(int frequency) {
        checkPositive(frequency);
        this.frequency = frequency;
    }

    public void setTemperature(int temperature) {
        checkPositive(temperature);
        this.temperature = temperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        checkPositive(maxTemperature);
        this.maxTemperature = maxTemperature;
    }
}
