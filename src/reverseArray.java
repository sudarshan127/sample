public class reverseArray {

    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        int lenght = arr.length;
        int n = lenght;
        int [] b= new int[n];
        for(int i=0; i<lenght; i++) {
            b[lenght -1] = arr[i];
            lenght --;
        }

        System.out.println("Reversed Array: ");
        for(int j=0; j<n; j++) {
            System.out.println(b[j]);
        }

    }
}
