import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double>history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = this.history.get(0);

        for (int i = 0; i < this.history.size(); i++) {
            double current = this.history.get(i);

            if(current > max) {
                max = current;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);

        for (int i = 0; i < this.history.size(); i++) {
            double current = this.history.get(i);

            if(current < min) {
                min = current;
            }
        }
        return min;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (int i = 0; i <this.history.size(); i++) {
            sum = sum + this.history.get(i);
        }
        return sum / this.history.size();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
