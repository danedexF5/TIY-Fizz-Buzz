/**
 * Created by danedexheimer on 4/13/16.
 */
public class FizzBuzz {
    public static void main(String[] args) {

<<<<<<< HEAD
        for (int x = 1; x <= 100; x++) {

            if
                    ((x % 3 == 0) && (x % 5 == 0))
                System.out.println(x + "FizzBuzz");

            else if
                    (x % 3 == 0)
                System.out.println(x + "Fizz");

            else if
                    (x % 5 == 0)
                System.out.println(x + "Buzz");
            else System.out.println(x);
=======
        for (int x = 1; x <= 100; x++){

            if (x % 3 == 0)
                System.out.println("Fizz");

                else if
                    (x % 5 == 0)
                System.out.println("Buzz");

                else if
                    (x % 15 == 0)
                System.out.println("FizzBuzz");
>>>>>>> 3bfd1b6f34acdd32741c9ebc0462ffccb855ffdb

        }
    }
}