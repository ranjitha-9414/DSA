package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public  class RotateArray {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        
        for(int i =0;i<n;i++) {
            
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        int rev[] = new int[arr.length];
        int j = arr.length-1;
        //Step1: Reverse array
        for(int i =0;i<n;i++) {
          
                rev[j] = arr[i];  
                j--;              
         }
        
          
         for(int i =0;i<rev.length;i++) {
            System.out.print(rev[i] + " ");
        }
        System.out.println();
        //Step2: reverse till k
        int r1[] = new int[k];
        
       for(int i = k-1;i>=0;i--) {
             
            r1[k-1-i]= rev[i];
       }

       for(int i =0;i<r1.length;i++) {
            System.out.print(r1[i] + " ");
        }
        int r2[] = new int[n-k];
        
       for(int i = n-1;i>=k;i--) {
             
            r2[n-1-i]= rev[i];
       }

       for(int i =0;i<=k;i++) {
            System.out.print(r2[i] + " ");
        }
        System.out.println();
        //Anotherapproach for printing
        int n1 = r1.length;
        int n2 = r2.length;
        int merge[] = new int[n1+n2];
        int index =0;
        for(int i =0;i<n1;i++) {
            merge[index++] = r1[i];
        }

        for(int i =0;i<n2;i++) {
            merge[index++] = r2[i];
        }

        System.out.println(Arrays.toString(merge));
    }
    
}
