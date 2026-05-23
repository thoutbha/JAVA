package BASICS;

public class Main {
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard("Blue", 3);
        System.out.println("Cupboard Color: " + cupboard.getColor());
        System.out.println("Number of Shelves: " + cupboard.getShelves());
    }
}


class Cupboard {
    private String color;
    private int shelves;

    public Cupboard(String color, int shelves) {
        this.color = color;
        this.shelves = shelves;
    }

    public String getColor() {
        return color;
    }

    public int getShelves() {
        return shelves;
    }
}
