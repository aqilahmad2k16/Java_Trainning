package methodOverriding;

public class Test1{
    final void loanA(){
        System.out.println("$ " +32500000+ "/-");
    }

    final float loanA(int a, int b){
        // System.out.println("$ " + 200000*(a/b)+"/-");
        return (20000*(a/b));
    }

    public static void main(String[] args) {
        Test1 ln = new Test1();
        ln.loanA();
        System.out.println("$ " + ln.loanA(10,5)+ "/-");
        // ReserveBank nl = new ReserveBank();
        // nl.loanA();
    }
}

// class ReserveBank{
//     final void loanA(){
//         System.out.println("$ " +2500000+ "/-");
//     }
//     final void loanB(){
//         System.out.println("$ " +8500000+ "/-");
//     }
// }
