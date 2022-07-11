package Test2;

// import javax.swing.event.SwingPropertyChangeSupport;

public class ReverseStringAtOddPosition {
    //Reverse a string which are at odd indexes only

    public static void reverseTheString(String str){
        String[] strArr = str.split(" "); // T.C = O(n);
       
        String s = " ";
        for(int i=0; i<strArr.length; i++){ // T.C = O(n *n/2) = O(n^2)
            if(i%2 == 0){
                s += findTheReverse(strArr[i]) + " "; // T.C = O(n);
            }else{
                s += strArr[i] + " ";
            }


        }

        System.out.println(s);
        
    }

    public static String findTheReverse(String str){
        return new StringBuilder(str).reverse().toString(); // T.C = O(n);
    }
    public static void main(String[] args) {
        
        // System.out.println("enter the stirng");
        String str = "you are good engineer";
        reverseTheString(str);
    }



}
