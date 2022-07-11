package Test24;

public class ReverseTheString {
    public static void main(String[] args) {
        String str = "Let's take leetcode contests";
        String[] arr = str.split(" ");
        String s = "";
      
        for(int i=0; i<arr.length; i++){
            char[] ch = arr[i].toCharArray();
            int j=0, k=ch.length-1;
            while(j<k){
                char temp = ch[j];
                ch[j] = ch[k];
                ch[k] = temp;
                j++; k--;
            }

            s += String.valueOf(ch) + " ";

        }

        System.out.println(s);
    }
}
