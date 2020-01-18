import java.util.Scanner;

public class alphabetical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter how many names");
        int n = input.nextInt();

        String str[] = new String[n];

        Scanner str1 = new Scanner(System.in);
        System.out.println("enter names");
        for (int i = 0; i < n; i++) {
            str[i] = str1.nextLine();

        }

        //compare
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str[i] + ",");
        }


    }
}
