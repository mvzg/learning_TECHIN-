
public class HealthStation {
    private int howManyTimesWeighed;

    // Constructor, sverimu skaiciavimas prasideda nuo 0
    public HealthStation() {
        this.howManyTimesWeighed = 0;
    }

    //ckaiciuojami sverimai
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.howManyTimesWeighed = this.howManyTimesWeighed + 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        int newWeight = currentWeight + 1;
        person.setWeight(newWeight);
    }

    public int weighings() {
        return this.howManyTimesWeighed;
    }

}
