import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first numbers");
        int a = input.nextInt();
        System.out.println("enter second numbers");
        int b = input.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a =" + a);
        System.out.println("b =" + b);

    }
}
