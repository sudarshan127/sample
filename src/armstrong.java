import java.util.Scanner;
import java.lang.Math;

public class armstrong {

    public static void main(String[] args) {
        double sum= 0;
        int R =0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter your numbers");
        int a = input.nextInt();
        int temp = a;
        int b=a;
        int count=0;

        while (a>0) {
            a = a/10;
            count = count+1;

        }

        while (b>0) {
            R = b % 10;
            sum = sum + Math.pow(R, count);
            b = b / 10;

        }

        if(temp==sum)
        System.out.println("Armstrong  =" + sum);
        else
            System.out.println("not Armstrong");


    }

}

