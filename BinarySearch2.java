import java.util.Scanner;

public class BinarySearch2 {
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
        
        BinarySearch(arr, left, right, key);
    }
    public static void BinarySearch(int arr[], int left, int right, int key) {
        if(left > right) {
            System.out.println("Key not found");
            return ;
        }
        int mid =( left + right)/2;
        if (arr[mid] == key) {
            System.out.println("Key found");
            return;
        }
        else if(key < arr[mid] ) {
           // right = mid - 1;
            BinarySearch(arr, left, mid-1, key);
        }
        else if(key > arr[mid]) {
            left = mid +1;
            BinarySearch(arr, mid+1, right, key);
        }
        
    }
}
