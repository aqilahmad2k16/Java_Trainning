package Recursion;

public class FabonacciSeries {
    static int a=0, b =1;
    public static void main(String[] args) {
        System.out.print(a + " " + b);
        FabonacciSeries fs = new FabonacciSeries();

        // 1st approach by recursion
        // fs.findFactorial(5);


        //2nd approach by iteration
        int n=5;
        for(int i=2; i<=n; i++){
            int c = a+b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    void findFactorial(int n){
        if(n>=1){

            int c = a+b;
            System.out.print(" " + c);
            a = b;
            b = c;

            findFactorial(n-1);
        }

    }
}
