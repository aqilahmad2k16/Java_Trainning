package StringQueston;

public class ReverseTheWordsOfString {   
    /// Reverse the words of string
    public static void main(String[] args) {
        String str = "Hey there! what's up man?";
        char[] st = str.toCharArray();
        int i=0, j=0;
        while(j<st.length){
            if(st[j] == ' '){
                reverseTheWords(st, i, j-1);
                i = j+1;
            }
            j++;
        }

        reverseTheWords(st, i, j-1);
        System.out.println(new String(st));
    }

    public static void reverseTheWords(char[] st, int i, int j){
        while(i<j){
            char temp = st[i];
            st[i] = st[j];
            st[j] = temp;
            i++; j--;
        }
    }
        


}
