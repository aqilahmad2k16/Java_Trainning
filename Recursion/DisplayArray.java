package Recursion;

public class DisplayArray {
    public static void main(String[] args) {
        
        int[] arr = {4,5,6,12,32,78};

        displayArrayElement(arr, 0);
    }

    public static void displayArrayElement(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }


        System.out.println(arr[idx] + " ");
        displayArrayElement(arr, idx+1);
    }

    
}
