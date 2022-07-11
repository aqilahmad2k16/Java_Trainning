package Test26;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array and target");

        int n = scan.nextInt();
        int target = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int l=0, r=n-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]<target){
                l=mid+1;
            }else if(arr[mid]>target){
                r = mid-1;
            }else{
                System.out.println(mid);
                return;
            }
        }
    }
}
