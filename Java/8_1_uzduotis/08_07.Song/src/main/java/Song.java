public class Song {

    private int length;
    private String name;

    //Constructor
    public Song(String name, int length) {
        this.length = length;
        this.name = name;
    }

    // Method
    public String name() {
        return this.name;
    }

    // Method
    public int length() {
        return this.length;
    }

}
