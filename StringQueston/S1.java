package StringQueston;

class S1{
    public static void main(String[] args) {
        String s1 = "hey";
        String s2 = "there";

        // s1 += s2;
        // char[] c = s1.toCharArray();
        // int l = 0, r = s1.length()-1;
        // while(l<r){
        //     char temp = c[l];
        //     c[l] = c[r];
        //     c[r] = temp;
        //     l++;
        //     r--;
        // }

        // System.out.println(new String(c));
        
        // s1 += s2;
        
        // char[] ch = s1.toCharArray();
        // int l=0, r=ch.length-1;
        // while(l<r){
        //     char temp = ch[l];
        //     ch[l] = ch[r];
        //     ch[r] = temp;
        //     l++;
        //     r--;
        // }
        // System.out.println(s1);
        // System.out.println(new String(ch));

        s1 += s2 + "";
        char[] ch = s1.toCharArray();
        int i=0, j=ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++; j--;
        }


        System.out.println(new String(ch));


    }
}