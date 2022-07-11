package ArraysQuestion;

public class ShiftZero {
    public static void main(String[] args) {
        // int[] arr = {2,10,0,5,0,3,4,0};
        int[] arr = {0,0,0,2,3};
        // int i=0, j=1;
        // while(i<arr.length && j<arr.length){
        //     if(arr[i] == 0 && arr[j] != 0){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //     }else if(arr[i] != 0 && arr[j] == 0){

        //     }
        // }

        // int i=0, j=1;
        // while(j<arr.length && i<arr.length){
        //     if(arr[i] != 0){
        //         i++;
        //         j++;
        //     }else if(arr[i] == 0 && arr[j] == 0){
        //         j++;
        //     }else if(arr[i] == 0 && arr[j] !=0){
        //         // swaping
        //         int temp = arr[j];
        //         arr[j] = arr[i];
        //         arr[i] = temp;
        //         i++;
        //         j++;
        //     }
        // }

        // for(int k=0; k<arr.length; k++){
        //     System.out.println(arr[k]);
        // }

        int i=0, j=1;
        while(i<arr.length && j<arr.length){
            if(arr[i] != 0){
                i++;
                j++;
            }else if(arr[i] == 0 && arr[j] == 0){
                j++;
            }else if(arr[i] == 0 && arr[j] != 0){
                int temp = arr[j];
                arr[j]  = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]+ " ");
        }

    
    }
}
