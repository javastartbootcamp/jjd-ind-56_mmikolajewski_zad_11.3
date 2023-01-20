package pl.javastart.task.logic;

import java.util.InputMismatchException;

public abstract class Component {
    String name;
    String producer;
    String id;

    public Component(String name, String producer, String id) {
        this.name = name;
        this.producer = producer;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Component " +
                name + ", " +
                producer + ", " +
                "id: " + id;
    }

    void checkPositive(int value) {
        if (value < 0) {
            throw new InputMismatchException("value should be positive");
        }
    }
}
