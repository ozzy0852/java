package homework.homework3;

public class House {
    private int width;
    private int length;
    private String address;

    int high;
    String owner;


    public House(int width, int length, int high, String owner, String address) {
        this.address = address;
        this.owner = owner;
        this.high = high;
        this.length = length;
        this.width = width;
    }

    public House(String address, int width, int length) {
        this.address = address;
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public String getAddress() {
        return this.address;
    }
}

