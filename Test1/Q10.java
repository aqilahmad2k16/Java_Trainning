package Test1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two String");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        str1 += str2;
        // StringBuilder sb = new StringBuilder(str1 + str2);
        // System.out.println(sb);
        int i=0, j=str1.length()-1;
        // int[] c = sb.
        char[] c = str1.toCharArray(); // use to convert string to character array
        while(i<j){

            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }

        String str = new String(c);
        System.out.println(str);
        scan.close();

        

    }
}
