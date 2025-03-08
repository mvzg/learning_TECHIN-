public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    //Metodai
    public int value() {
        return value;
    }

    public void increase() {
        value = value + 1;
    }

    public void decrease() {
        value = value - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return; //nieko nedaro jeigu maziau uz 0
        } else {
            value = value + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return; //nieko nedaro jeigu maziau uz 0
        } else {
            value = value - decreaseBy;
        }
    }

}
