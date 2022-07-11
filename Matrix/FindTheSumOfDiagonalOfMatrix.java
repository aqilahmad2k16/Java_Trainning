package Matrix;

import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;

public class FindTheSumOfDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] mat = new int[m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        int j = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][j];
            j++;
        }

        int k = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][k];
            k--;
        }

        sum -= mat[n / 2][n / 2];

        System.out.println(sum);
    }
}
