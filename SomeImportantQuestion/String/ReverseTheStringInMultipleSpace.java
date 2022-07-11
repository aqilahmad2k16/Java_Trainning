package SomeImportantQuestion.String;

public class ReverseTheStringInMultipleSpace {
    // Reverse the word of String when there is multiple space between words of string

    public static void main(String[] args) {
        String str = " hey there  what's up ";
        char[] st = str.toCharArray();

        int i=0, j=0;
        while(j<st.length){
            if(st[j] == ' '){
                swapChar(st, i, j-1);
                j++;
                i=j;
            }else{
                j++;
            }
        }

        System.out.println((new String(st).trim()));
    }

    public static void swapChar(char[] st, int l, int r){
        if(r>=0){
            while(l<r){
                char temp = st[l];
                st[l] = st[r];
                st[r] = temp;
                l++; r--;
            }
        }
    }
}
