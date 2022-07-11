package GetStarted;
public class CoceptString {
    public static void main(String[] args) {
        // char ch1='1';
        // char ch2='2';
        // char ch3='3';
        // char ch4='3';
        // int val1=ch1;
        // int val2=ch2;
        // int val3=ch3;
        // int val4=ch4;
        // // System.out.println(val1+" "+val2+" "+val3+" "+val4);
        // String str = "4562";
        // String str1 = "125";

        // int a = str1.charAt(0)-'0';
        // int b = str1.charAt(2)-'0';
        // System.out.println(a);
        // System.out.println(b);
        // for(int i=0; i<str.length(); i++){
        //     char ch=str.charAt(i);
        //     int val=ch;
        //     // System.out.println(ch+"->"+val);
        // }

        // for(int i=0; i<str1.length(); i++){
        //     char ch=str1.charAt(i);
        //     int val=ch-'0';
        //     System.out.println(ch+"->"+val);
        // }
        // String str2="Aqil";
        // String str3="";
        // for(int i=0; i<str2.length(); i++){
        //     char ch=str2.charAt(i);
        //     if(ch>='A' && ch<='Z'){

        //         char chr=(char)(ch+32);
        //         str3 += chr;
        //     }else{
        //         char chr=(char)(ch-32);
        //         str3 += chr;
        //     }



        // }
        // System.out.println(str3);

        int[] nums1={1,3};
        int[] nums2={2};
        int m=nums1.length, n=nums2.length;
        int[] merArr=new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merArr[k]=nums1[i];
                i++;
                k++;
            }else if(nums1[i]>nums2[j]){
                merArr[k]=nums2[j];
                j++;
                k++;
            }else{
                merArr[k]=nums1[i];
                k++;
                i++;
                
            }
        }
        
        while(i<m){
            merArr[k]=nums1[i];
            i++;
            k++;
            
        }
        
        while(j<m){
            merArr[k]=nums2[j];
            j++;
            k++;
        }

        for(int s=0; s<merArr.length; s++){
            System.out.println(merArr[s]);
        }

    }
}
