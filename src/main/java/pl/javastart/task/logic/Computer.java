package pl.javastart.task.logic;

public class Computer {
    public OverclockableComponent processor;
    public OverclockableComponent ram;
    public Component hardDrive;

    public Computer(OverclockableComponent processor, OverclockableComponent ram, Component hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer: \n" +
                processor + "\n" +
                ram + "\n" +
                hardDrive + "\n";
    }
}
