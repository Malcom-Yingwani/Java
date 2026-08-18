package ch6;

import java.util.ArrayList;

public class Egg {
    static ArrayList<Egg> myList = new ArrayList<Egg>();

    public static void main(String[] args) {
        Egg egg = new Egg(); // need an instance since myList is not static

        Egg egg1 = new Egg();
        myList.add(egg1);

        Egg egg2 = new Egg();
        myList.add(egg2);

        int theSize = myList.size();
        boolean isIn = myList.contains(egg1);
        boolean empty = myList.isEmpty();

        myList.remove(egg1);

        System.out.println("Size: " + theSize);
        System.out.println("Contains egg1: " + isIn);
        System.out.println("Empty: " + empty);
    }
}