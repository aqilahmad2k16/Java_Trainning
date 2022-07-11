package methodOverriding;

public class Test {
    

    public static void main(String[] args) {

        
        // SBI sr = new SBI();
        // sr.getRate();

        // sr.newRate();
        // System.out.println("case1 ");
        // ReserveBank br = new ReserveBank();
        // br.getRate();
        // br.newRateof();

        // System.out.println("case 2");
        // // SBI sbr = new ReserveBank(); // this won't work we can't send bigger into smaller
        // // we can do it with help of first upcast it then down cast it

        ReserveBank rbr = new SBI();// upcast first
        SBI sbr = (SBI) rbr;// then downcast
        sbr.newRate();
        sbr.getRate();

        // System.out.println("case 3");
        // ReserveBank rb = new SBI(); // up-casting;
        // rb.newRate();
        // rb.getRate(); // it will call overriden method
        // // rb.newRateof(); // parent class can't use field and method of child class except it's field and behaviour;
    }
}

class ReserveBank{
    // float rate;
    // Bank(float rate){
    //     this.rate = rate;
    // }
    void newRate(){
        System.out.println(6.5);
    }

    void getRate(){
        System.out.println(11);
    }
}

class SBI extends ReserveBank{
    void getRate(){
        System.out.println(8.5);
    }

    void newRateof(){
        System.out.println(9);
    }
}
