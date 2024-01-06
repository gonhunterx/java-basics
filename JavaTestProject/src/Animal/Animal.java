package Animal;
import java.util.Random;


public class Animal {
    public void iamdog() {
        System.out.println("i am dog");
    }

    public static void doStuff() {
        Random rand = new Random();
        System.out.println(rand);
        
        int a = rand.nextInt();
        if (a == 0) {
            System.out.println("Equals: 0");
        } else {
            System.out.println("random num = " + a);
        }
    }
}
