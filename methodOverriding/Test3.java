package methodOverriding;

public class Test3 extends ReserveBank {
    // void loanA(){ // can't override it but if we use the same method with same signature and return type with static keyword then it will hide the same method of parent method 
    //     System.out.println(5000000);
    // }

    // static void loanA(){// this is method hiding
    //     System.out.println(85897000);
    // }

    // public static void rate(){
    //     System.out.println(8.5);
    // }

    // public static float rate(int a , int b){
    //    return (100*a*b);
    // }

    // int findSum(){// incompatitbility return type with parent method
    //     return 25;
    // }

    void findSum(){
        System.out.println(85);
    }
    public static void main(String[] args) {
        Test3 test = new Test3();
        // test.loanA();
        // System.out.println(test.rate(2,2));
        // test.rate();
        test.findSum();
    }
}

class ReserveBank{
        static void loanA(){
            System.out.println("$ " +2500000+ "/-");
        }
        // final void loanB(){
        //     System.out.println("$ " +8500000+ "/-");
        // }

        void findSum(){
            System.out.println(36);
        }
}
