package Test3;

import java.util.Scanner;

public class findTheSumofDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        // int sum =0;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(i == j){
        //             sum += mat[i][j];
        //         }
        //     }
        // }

        if(n%2 == 0){
            int sum =0;
        int j=0; 
        for(int i=0; i<mat.length; i++){
            sum += mat[i][j];
            j++;
        }

        int k=mat[0].length-1;
        for(int i=0; i<mat.length; i++){
            sum += mat[i][k];
            k--;
        }

        System.out.println(sum);
        }else{
            int sum =0;
        int j=0; 
        for(int i=0; i<mat.length; i++){
            sum += mat[i][j];
            j++;
        }

        int k=mat[0].length-1;
        for(int i=0; i<mat.length; i++){
            sum += mat[i][k];
            k--;
        }

        sum -= mat[n/2][n/2];
        System.out.println(sum);
        }
        

        

        

    }
}
