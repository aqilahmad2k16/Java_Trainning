package StringQueston;

public class AddTwoString {
    // add two String numbers
    public static void main(String[] args) {
        
        String s1 = "693";
        String s2 = "26";

        int i=s1.length()-1, j=s2.length()-1;
        int c = 0;

        StringBuffer ans = new StringBuffer();
        while(i>=0 || j>=0 || c >0){
            int a =0;
            if(i>=0){
                a = s1.charAt(i) - '0';
                i--;
            }

            int b =0;
            if(j>=0){
                b = s2.charAt(j) - '0';
                j--;
            }

            int sum = a+b+c;
            c = sum/10;
            sum = sum%10;
            ans.insert(0, sum);
        }

        System.out.println(ans.toString());
    }


}
