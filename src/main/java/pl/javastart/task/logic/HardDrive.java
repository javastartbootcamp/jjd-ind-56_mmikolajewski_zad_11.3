package pl.javastart.task.logic;

public class HardDrive extends Component {

    int capacity;

    public HardDrive(String name, String producer, String id, int capacity) {
        super(name, producer, id);
        setCapacity(capacity);
    }

    public void setCapacity(int capacity) {
        checkPositive(capacity);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", pojemność: " + capacity + " GB";
    }
}
