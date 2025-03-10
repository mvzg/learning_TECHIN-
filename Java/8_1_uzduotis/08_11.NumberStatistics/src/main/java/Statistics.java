
public class Statistics {
    private int count;
    private int sum;

    //Constructor
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count = this.count + 1;
        this.sum = this.sum + number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        if (this.sum == 0) {
            return 0;
        } else {
            return this.sum;
        }
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        } else {
            return (double) this.sum / this.count;
        }
    }


}
