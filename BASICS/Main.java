package BASICS;

public class Main {
    public static void main(String[] args) {
        
        Cupboard.show();
    }
}


class Cupboard {
    static int shelfCount = 10;
    static String color = "White";
    static String[] TopSection = {"Daily", "Formal","Party"};

    static void show(){

        System.out.println("This is a cupboard.");
        System.out.println("Color: " + color);
        System.out.println("Number of Shelves: " + shelfCount);
        System.out.println("Top Section: " + String.join(", ", TopSection));

    }
}

