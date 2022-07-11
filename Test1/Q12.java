package Test1;

public class Q12 {
    public static void main(String[] args) {
        
        int n = 12340056;
        int m = n;
        // int k = 3; rotate right direction
        int k = -1; // rotate in left direction;

        int don = 0;
        while(n!=0){
            n /= 10;
            don++;
        }
    
        k = k%don;
        if(k<0){
            k = k+don;
        }

        int pow = (int)Math.pow(10,k);
        int pow1 = (int)Math.pow(10,don-k);
        int rem = m%pow;
        int ques = m/pow;

        int sum = rem*pow1 + ques;
        System.out.println(sum);
    }


}
