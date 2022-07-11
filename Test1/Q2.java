package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enther the size of the array");
        int n=scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scan.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }

        Arrays.sort(arr);
        int[] newArr = new int[n];

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<arr.length; j++){
                if(list.get(i) == arr[j]){
                    newArr[i] = j+1;
                }
            }
        }

        for(int i=0; i<newArr.length; i++){
            System.out.println(newArr[i] + " ");
        }
        scan.close();


    }
}
