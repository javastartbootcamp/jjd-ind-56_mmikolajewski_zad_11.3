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

    public void overclock(int value) {
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
