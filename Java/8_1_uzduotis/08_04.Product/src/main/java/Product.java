public class Product {

    private double price;
    private int quantity;
    private String name;

    //Constructor
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    // Method
    public void printProduct() {
        System.out.println(this.name + ", " + this.price + ", " +  this.quantity);
    }

}
