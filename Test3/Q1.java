package Test3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scan.nextLine();

        // String[] sArr = str.split(" ");
        // int maxL = Integer.MIN_VALUE;
        // int minL = Integer.MAX_VALUE;
        // int maxIn=0;
        // int minIn=0;
        // for(int i=0; i<sArr.length; i++){
        //     if(sArr[i].length() > maxL){
        //         maxL = sArr[i].length();
        //         maxIn = i;
        //     }

        //     if(sArr[i].length() < minL){
        //         minL = sArr[i].length();
        //         minIn = i;
        //     }
        // }

        // System.out.println("Largest word is " + sArr[maxIn]);
        // System.out.println("Smallest word is " + sArr[minIn]);

        //Revision
        String arr[] = str.split(" ");
        int minL = Integer.MAX_VALUE, maxL = Integer.MIN_VALUE;
        int minIdx = 0, maxIdx = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].length()<minL){
                minL = arr[i].length();
                minIdx = i;
            }

            if(arr[i].length() > maxL){
                maxL = arr[i].length();
                maxIdx = i;
            }
        }

        System.out.println("length of largest word is " + maxIdx);
        System.out.println("lenght of smallezt word is  " + minIdx);
        scan.close();

        
    }
}
