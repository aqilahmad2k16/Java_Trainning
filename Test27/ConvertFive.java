package Test27;

import java.util.Scanner;

public class ConvertFive {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers and number of test case");
        
        int t =scan.nextInt();
       
      
        for(int i=1; i<=t; i++){
            int n=scan.nextInt();
            int sum=0, pow=1;
            if(n>0){

               
                while(n!=0){
                    int rem = n%10;
                    if(rem == 0){
                        sum += 5*pow;
                    }else{
                        sum += rem*pow;
                    }
            
                    int ques = n/10;
                    pow *= 10;
                    n = ques;
                }
        
                System.out.println(sum);
            }else if(n<0){
                
                while(n!=0){
                    int rem = n%10;
                    if(rem == 0){
                        sum += 5*pow;
                    }else{
                        if(rem < 0){
                            rem = -(rem);
                            sum+= rem*pow;
                        }else{

                            sum += rem*pow;
                        }
                    }
            
                    int ques = n/10;
                    pow *= 10;
                    n = ques;
                }
        
                System.out.println("-"+sum);
               
            }else{
                System.out.println(5);
            }
            
        }
    }
}
