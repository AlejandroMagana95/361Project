public class Item {
    int id;
    double weight;
    double value;
    double priority;

    // Constructor
    public Item(int id, double weight, double value, double priority) {
        this.id = id;
        this.weight = weight;
        this.value = value;
        this.priority = priority;
    }

    // Optional but very useful for printing/debugging
    @Override
    public String toString() {
        return "Item " + id +
               " | weight=" + weight +
               " | value=" + value +
               " | priority=" + priority;
    }
}

