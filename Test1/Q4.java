package Test1;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2};
        int [] newArr = {2,4,3,1,7,5,15};

        for(int i=0; i<arr.length; i++){
          for(int j=0; j<newArr.length; j++){
              if(newArr[j] == arr[i]){
                  break;
              }else{
                  System.out.println("given array is not subset of given array");
                  return ;
              }
          }
        }

        System.out.println("array is subset of given array");
        
    }
}
