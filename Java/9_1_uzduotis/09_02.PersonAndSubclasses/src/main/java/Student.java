public class Student extends Person {
    private int credits;

    public Student(String nameAndLastName, String address) {
        super(nameAndLastName, address);
        this.credits = 0;
    }

    public void study() {
        this.credits = this.credits + 1;
    }

    public int credits() {
        return this.credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
    }
}
