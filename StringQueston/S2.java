package StringQueston;

import java.util.Scanner;

public class S2{
    public static void main(String[] args) {
        String s1 = "23";
        String s2 = "111";
        int i=s1.length()-1, j=s2.length()-1;
        int pow = 1;
        int sum = 0;
        int car = 0;
        while(i>=0 && j>=0){
            int val1 = s1.charAt(i) - '0';
            int val2 = s2.charAt(j) - '0';
            int temp = val1 + val2 + car;
            int rem = temp%10;
            int ques = temp/10;
            sum += rem*pow;
            pow *= 10;
            car = ques;
            i--;
            j--;

        }

        while(j>=0){
            int val = s2.charAt(j) - '0';
            int temp = val+car;
            int rem = temp%10;
            int ques = temp/10;
            car = ques;
            sum += rem*pow;
            pow *= 10;
            j--;

        }

        while(i>=0){
            int val = s1.charAt(i) - '0';
            int temp = val+car;
            int rem = temp*10;
            int ques = temp/10;
            car = ques;
            sum += rem*pow;
            pow *= 10;
            i--;

        }
        String str = " ";
        str += sum;
        System.out.println(str);

        // Scanner scan = new Scanner(System.in);
        // String s1 = scan.nextLine();
        // String s2 = scan.nextLine();

    }
}