
import  java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements to be inserted to an array: ");
        int arr[] = new int[n];
        for(int i = 0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to be searched: ");
        int key = sc.nextInt();

        for(int i = 0; i< arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Key found");
                return;
            }
        }
        System.out.println("Key not found");
    }
}
