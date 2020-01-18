import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n= 0;
        int R =0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter your number");
        int a = input.nextInt();
        int b = a;
        while (a>0) {
            R = a % 10;
            n = n * 10 + R;
            a = a / 10;
        }

        if (b==n) {
            System.out.println("palindrome");
        }
        else
            System.out.println("Not Palindrome");
        //System.out.println("Reversed =" + n);
    }

}
