package Recursion;

public class FindTheLastIndexByRecursion {
    public static void main(String[] args){
        int[] arr = {-1,0,3,4,10,15};
        int l=0, r=arr.length;
        int tar = 3;
        System.out.println(findTheIndex(arr, l, r, tar));
    }

    public static int findTheIndex(int[] arr, int l, int r, int tar){
        if(l<r){
            return -1;
        }

        int mid = (l+r)/2;

        if(arr[mid] == tar){
            return mid;
        }

        int left = findTheIndex(arr, l, mid-1, tar);
        if(left >= 0){
            return left;
        }
        
        int right = findTheIndex(arr, mid+1, r, tar);
        return right;
            
        
        
       
          
        


    }
}
