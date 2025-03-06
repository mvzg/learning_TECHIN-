public class Gauge {

    private int value;

    //Constructor
    public Gauge() {
    }

    // Method
    public void increase() {
        if (value < 5) {
            value = value + 1;
        }
    }

    // Method
    public void decrease() {
        if (value < 0) {
            value = value - 1;
        }
    }

    // Method
    public int value() {
        return value;
    }

    // Method
    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }


}
