
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int totalPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.squares * compared.princePerSquare;
        int difference = Math.abs(totalPrice - comparedPrice);
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int totalPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.squares * compared.princePerSquare;

        if (totalPrice > comparedPrice) {
            return true;
        } else {
            return false;
        }
    }

}
