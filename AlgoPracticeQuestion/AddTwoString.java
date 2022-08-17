package AlgoPracticeQuestion;

public class AddTwoString {
    public static void main(String[] args) {
        
        String s1 = "695";
        String s2 = "64";
    
        int e1 = s1.length()-1, e2 = s2.length()-1;
        int car = 0;
        StringBuilder ans = new StringBuilder();
        while(e1>=0 || e2>=0 || car>0){
            int a =0;
            if(e1>=0){
                a = s1.charAt(e1) - '0';
                e1--;
            }

            int b =0;
            if(e2>=0){
                b = s2.charAt(e2) - '0';
                e2--;
            }

            int sum = a + b + car;
            int rem = sum%10;
            car = sum/10;
            ans.insert(0, rem);
        }

        System.out.println(ans);
    }
}
