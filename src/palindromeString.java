import java.util.Scanner;

public class palindromeString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your words");
        String s = input.nextLine();

        int slen = s.length();
        String reverse = "";
        for (int i = slen - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);

        }

        if (reverse.equals(s)) {
            System.out.println("palindrome");
        }
        else
            System.out.println("Not Palindrome");
        System.out.println(reverse);
    }
}