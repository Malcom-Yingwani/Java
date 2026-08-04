package ch1;

public class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
//            x = x + 1;
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}

//This will compile and run, but without a line added to the program, it would run forever in an infinite while loop!
