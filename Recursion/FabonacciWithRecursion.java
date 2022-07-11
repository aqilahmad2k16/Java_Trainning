package Recursion;



public class FabonacciWithRecursion {

    // 3rd approach
    public static void main(String[] args) {

        int n=5;
        for(int i=0; i<n; i++){
            System.out.println(findFabonacciSeries(i) + " ");
        }
        
    }

    public static int findFabonacciSeries(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1 || n == 2){
            return 1;
        }

        return findFabonacciSeries(n-1) + findFabonacciSeries(n-2);
    }
}
