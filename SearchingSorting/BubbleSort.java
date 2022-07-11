package SearchingSorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,4,3,8,2};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j+1] < arr[j]){
                    swap(arr, j+1, j);
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] arr, int i, int j){
        
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        
    }
}
