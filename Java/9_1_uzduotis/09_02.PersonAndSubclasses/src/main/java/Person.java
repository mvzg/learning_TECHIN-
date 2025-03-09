public class Person {
    private String nameAndLastName;
    private String address;

    public Person(String nameAndLastName, String address) {
        this.nameAndLastName = nameAndLastName;
        this.address = address;
    }

    public void setNameAndLastName(String nameAndLastName) {
        this.nameAndLastName = nameAndLastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameAndLastName() {
        return nameAndLastName;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return nameAndLastName + "\n  " + address;
    }

}
