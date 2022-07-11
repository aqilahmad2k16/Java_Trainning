package Test3;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class FindIndexofUnsortedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enther the size of the array and target value");
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();

        //1st approach
        // Arrays.sort(arr);
        // int l=0, r = arr.length-1;
        // while(l<r){
        //     if((arr[l] + arr[r]) > k){
        //         r--;
        //     }else if((arr[l] + arr[r]) < k){
        //         l++;
        //     }else{
        //         System.out.println("[" + l + "," + r + "]");
        //         return;
        //     }
        // }

        // 2nd brute force

        //3rd 
        // by HashMap
        
    }
}
