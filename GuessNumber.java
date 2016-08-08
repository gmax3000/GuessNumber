package GUI;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by maksymm on 8/7/16.
 */
public class GuessNumber {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Ya zagadal 4islo");
        int a = random.nextInt(5);
        int b = 0;
        Scanner scan = new Scanner(System.in);


        do {

            System.out.println("Put your 4islo");
            b = scan.nextInt();

            if (b > a) {
                System.out.println("Mnogo");


            } else if (a > b) {
                System.out.println("Malo");

            } else {
                System.out.println("Vy ugadali");

            }
        }
        while (a != b);
    }
}
