public class PaymentCard {
    private double balance;

    //Constructor
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    //Method
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if(this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if(this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney (double amount) {
        if(amount < 0) {
            return;
        }

        double finalBalance = this.balance + amount;

        if(finalBalance <= 150) {
            this.balance = finalBalance;
        } else {
            this.balance = 150;
        }
    }

}
