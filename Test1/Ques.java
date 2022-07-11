
package Test1;

import java.util.HashMap;

public class Ques {
    // find the frequency of character
    public static void main(String[] args) {
        String name = "JAVA";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<name.length(); i++){
            if(!hm.containsKey(name.charAt(i))){

                hm.put(name.charAt(i), 1);
            }else{
                int val = hm.get(name.charAt(i));
                val++;
                hm.put(name.charAt(i), val);
            }
        }

        System.out.println(hm);

       

    }
}
