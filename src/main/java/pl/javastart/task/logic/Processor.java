package pl.javastart.task.logic;

public class Processor extends OverclockableComponent implements Overclockable {

    private static final int INCREASE_TEMP_PER_100_HZ = 10;

    public Processor(String name, String producer, String id, int frequency, int assumedTemperature, int maxTemperature) {
        super(name, producer, id, frequency, assumedTemperature, maxTemperature);
    }

    @Override
    public void overclock(int value) {
        int n = value / 100;
        cheatingUp(n);
        frequency = frequency + value;
    }

    private void cheatingUp(int n) {
        if (isOverheated(n)) {
            throw new OverheatedException("Ryzyko przegrzania");
        }
        temperature = temperature + (INCREASE_TEMP_PER_100_HZ * n);
    }

    private boolean isOverheated(int n) {
        int t = temperature + (n * INCREASE_TEMP_PER_100_HZ);
        return t > maxTemperature;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", frequency: " + frequency + "Hz"
                + ", temperatura: " + temperature
                + ", maksymalna temperatura: " + maxTemperature;
    }
}

