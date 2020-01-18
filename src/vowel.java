import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your String");
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++) {

            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count ++;
            }
        }
        System.out.println("No of vowels are: " + count);


    }
}
