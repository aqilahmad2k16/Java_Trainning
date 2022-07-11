package Test3;

import java.util.Scanner;

class Q3{
    public static void findTheTransposeOfMatrix(int[][] mat){
        for(int i=0;i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                //swapping 
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.println(mat[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the dimension of the array");
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] mat = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        findTheTransposeOfMatrix(mat);

    }
}