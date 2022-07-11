package Test2;

// import java.util.regex.Pattern;

public class StringMethods {
    public static void main(String[] args) {
        // 1.string.split() for , and space separated string

        // String str = "hey,there,what,you,doing"; // use of split() method when delimeter is (,) (" ");
        // String[] strArr = str.split(",");

        // for(int i=0; i<strArr.length; i++){
        //     System.out.println(strArr[i] + " ");
        // }

        // 2.using Pattern.split() method*******************************

        // we use this when string follow a common pattern as delimeter

        // String str = "Hello #a1Ben #a1how #a1are #a1you ?"; 
        // String patternstr = "#a1";
        // Pattern ptr = Pattern.compile(patternstr);
        // String[] strArr = ptr.split(str);

        // for(int i=0; i<strArr.length; i++){
        //     System.out.println(strArr[i] + " ");
        // }

        //3. String[] approach
        String str = " hey there you are you doing";
        String[] arr = new String[]{str};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}




