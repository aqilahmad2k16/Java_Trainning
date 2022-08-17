package ArraysQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveThePrimeNumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the arraylist");
    
        ArrayList<Integer> list = new ArrayList<>();

        while(scan.hasNextInt()){
            int i=scan.nextInt();
            list.add(i);
        }

        for(int i=0; i<list.size(); i++){
            if( isItPrime(list.get(i))){
                list.remove(list.get(i));
            }
        }

        System.out.println(list);
    }

    public static boolean isItPrime(int n){
        int counter = 1;
        for(int div = 2; div*div <= n; div++){
            if(n%div == 0){
                counter++;
            }
        }

        if(counter == 1){
            return true;
        }else{
            return false;
        }
    }
    

}
