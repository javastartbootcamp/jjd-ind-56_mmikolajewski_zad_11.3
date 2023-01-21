package pl.javastart.task.test;

import pl.javastart.task.logic.*;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        OverclockableComponent processor1 = new Processor("Intel Core i7", "Intel", "1", 2137, 40, 80);
        OverclockableComponent ram1 = new Ram("Klev Bolt X", "Klevv", "1", 1066, 4096, 35, 45);
        Component hardDrive1 = new HardDrive("Papparacuda", "Seagate", "1D", 128);

        Computer computer = new Computer(processor1, ram1, hardDrive1);
        System.out.println(computer);

        try {
            Component processor2 = new Processor("Intel Core i7", "Intel", "1", 3000, -40, 80);
            computer.processor.overclock(5);
            computer.ram.overclock(5);
            processor1.setFrequency(200);
        } catch (OverheatedException e) {
            System.out.println("Ryzyko przegrzania, nie mozna podgręcić komponentu");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(computer);
        System.out.println("koniec programu");
    }
}
