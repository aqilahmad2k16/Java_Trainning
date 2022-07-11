package Test1;

import java.util.Scanner;



public class Q8 {
    public static void shiftThePrime(int [] arr){
        int[] newArr = new int[arr.length];
        int l=0, r=arr.length-1;
        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            int count = 1;
            for(int div = 2; div*div<=val; div++){
                if(val%div == 0){
                    count++;
                }
            }

            if(count == 1){
                newArr[l] = val;
                l++;
            }else{
                newArr[r] = val;
                r--;
            }


        }
        for(int j=0; j<newArr.length; j++){
            System.out.print(newArr[j] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        shiftThePrime(arr);
        scan.close();
    }
}
