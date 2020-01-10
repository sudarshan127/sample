import java.util.Scanner;

public class lcm_gcd {
    public static void main(String[] args) {
        int gcd = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter first numbers");
        int a = input.nextInt();

        System.out.println("enter second numbers");
        int b = input.nextInt();

        for(int i = 1; i <= a && i <= b; i++) {
            if(a%i == 0 && b%i == 0)
                gcd = i;

        }

        int lcm = (a * b) / gcd;

        System.out.println("lcm =" + lcm);

        System.out.println("gcd =" + gcd);
    }
}
