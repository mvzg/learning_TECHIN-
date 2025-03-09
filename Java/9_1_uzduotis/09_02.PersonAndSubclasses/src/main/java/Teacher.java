public class Teacher extends Person {
    private int salary;

    public Teacher(String nameAndLastName, String address, int salary) {
        super(nameAndLastName, address);
        this.salary = salary;
    }

    public int teacherSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }

}
