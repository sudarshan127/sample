import java.util.Scanner;

public class occurance {
    public static void main (String[] args) {

        Scanner abc = new Scanner(System.in);
        System.out.println("enter your string");
        String str = abc.nextLine();

        Scanner s = new Scanner(System.in);
        System.out.println("enter the word you want to look for");
        char ch = s.next().charAt(0);
        int count =0;
        int length = str.length();

        for (int i=0; i<length; i++) {
            if (str.charAt(i)==ch) {
                count++;
            }
        }
        System.out.println("The character occured " + count + " " + "times");
    }
}
