
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros > compared.euros()) {
            return false;
        } else {
            return this.cents < compared.cents(); // lygina centus, nes eurai yra vienodi
        }
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();

        // Centai
        if (newCents < 0) {
            newCents = newCents + 100;
            newEuros = newEuros - 1;
            }

            // Kad nebutu minusas
        if (newEuros < 0) {
            return new Money(0, 0);
        }

        // Create a new Money object with the calculated difference
        return new Money(newEuros, newCents);
    }
}

