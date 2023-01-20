package pl.javastart.task.logic;

import java.util.InputMismatchException;

public abstract class Component {
    private String name;
    private String producer;
    private String id;

    public Component(String name, String producer, String id) {
        this.name = name;
        this.producer = producer;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
