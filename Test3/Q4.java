package Test3;

public class Q4 {
    
    public static void findReverse(String s, String rStr){
        char[] c = s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }

        rStr += c.toString() + " ";
        
    }
    public static void main(String[] args) {
        
        String str = "hey! there, what's up";
        String[] sArr = str.split(" ");
        String rStr = " ";

        //Q1 reverse the sentense 
        // for(int i=sArr.length-1; i>=0; i--){
        //     rStr += sArr[i] + " ";
        // }
        // System.out.println(rStr);


        // Q2 reverse the word in the same order
        for(int i=0; i<sArr.length; i++){
            findReverse(sArr[i], rStr);
        }

        System.out.println(rStr);

    }

}
