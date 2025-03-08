
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccesfull = petesCard.takeMoney(8);
        System.out.println("Succesfully withdrew: " + wasSuccesfull);
        System.out.println("Money " + petesCard.balance());

        wasSuccesfull = petesCard.takeMoney(4);
        System.out.println("Succesfully withdrew: " + wasSuccesfull);
        System.out.println("Money " + petesCard.balance());


        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);


        PaymentCard annesCard = new PaymentCard(2);
        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);


    }
}

