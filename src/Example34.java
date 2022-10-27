import java.util.Scanner;
public class Example34 {
    public static void main(String[] argV) {

        double n;
        double factorial = 1;
        double e = 1;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Input a number: ");
        n = inputValue.nextDouble();

        for (int i = 1; i<=n; i++) {
            factorial *=i;    //factorial = factorial * i
            e+=1/factorial;   // e = e+ 1/factorial
        }
        System.out.println("e=   " +e);
    }
}
