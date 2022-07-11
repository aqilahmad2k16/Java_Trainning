package Matrix;

// import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("enter the size of matrix");
        // int m=scan.nextInt();
        // int n=scan.nextInt();
    
        // int[][] mat = new int[m][n];
        // for(int i=0; i<mat.length; i++){
        //     for(int j=0; j<mat.length; j++){
        //         mat[i][j] = scan.nextInt();
        //     }
        // }
        int[][] mat = {{1,2,3}, {4,5,6},  {7,8,9}};

        // int i=0;
        // while(i<mat.length){
        //     for(int j=0; j<i; i++){
        //         int temp = mat[i][j];
        //         mat[i][j] = mat[j][i];
        //         mat[j][i] = temp;
        //     }

        //     i++;
        // }

        // for(int k=0; k<mat.length; k++){
        //     for(int j=0; j<mat.length; j++){
        //        System.out.println(mat[k][j]);
        //     }
        // }

        int i=0; 
        while(i<mat.length){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
            
            i++;
        }

        for(int k=0; k<mat.length; k++){
            for(int j=0; j<mat[0].length; j++){
                System.out.println(mat[k][j]);
            }
        }

    }
}
