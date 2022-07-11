package Matrix;

import java.util.Scanner;

public class StateOfWakanda1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int m=scan.nextInt();
        int n=scan.nextInt();
    
        int[][] mat = new int[m][n];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        int j=0;
        while(j<mat[0].length){
            if(j%2==0){
                for(int i=0; i<mat.length; i++){
                    System.out.print(mat[i][j] + " ");
                }
                j++;
            }else{
                for(int i=mat.length-1; i>=0; i--){
                    System.out.print(mat[i][j] + " ");
                }
                j++;
            }

            scan.close();
        }
    }
}
