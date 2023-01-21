package pl.javastart.task.logic;

public class Processor extends OverclockableComponent implements Overclockable {

    private static final int INCREASE_TEMP_PER_100_HZ = 10;

    public Processor(String name, String producer, String id, int frequency, int assumedTemperature, int maxTemperature) {
        super(name, producer, id, frequency, assumedTemperature, maxTemperature);
    }

    @Override
    int getIncreaseTemp() {
        return INCREASE_TEMP_PER_100_HZ;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", frequency: " + frequency + "Hz "
                + ", temperatura: " + temperature
                + ", maksymalna temperatura: " + maxTemperature;
    }
}

