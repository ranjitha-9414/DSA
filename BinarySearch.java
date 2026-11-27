import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
         int key = sc.nextInt();
        int left = 0;
        int right = arr.length-1;
       
        while (left <= right) {
            int mid = right + left/2;
            if(arr[mid] == key) {
                System.out.println("Key Found");
                return ;
            }
            else if(key < arr[mid]) {
                right = mid -1;
            }
            else if(key > arr[mid]) {
                left = mid + 1;
            }
        }
        System.out.println("Key not found");
    }
}
