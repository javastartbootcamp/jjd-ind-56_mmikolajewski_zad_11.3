package pl.javastart.task.logic;

public class Ram extends OverclockableComponent implements Overclockable {

    int memory;
    private static final int INCREASE_TEMP_PER_100_HZ = 15;

    public Ram(String name, String producer, String id, int frequency, int memory, int assumedTemperature, int maxTemperature) {
        super(name, producer, id, frequency, assumedTemperature, maxTemperature);
        setMemory(memory);
    }

    public void setMemory(int memory) {
        checkPositive(memory);
        this.memory = memory;
    }

    @Override
    int getIncreaseTemp() {
        return INCREASE_TEMP_PER_100_HZ;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", pamięć: " + memory
                + ", frequency: " + frequency + "Hz"
                + ", temperatura: " + temperature
                + ", maksymalna temperatura: " + maxTemperature;
    }

}
