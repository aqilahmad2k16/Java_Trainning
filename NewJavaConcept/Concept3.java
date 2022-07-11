package NewJavaConcept;


interface Bank{
    void findRate();
}

interface SBI extends Bank{
   

    


    
}


public class Concept3 implements SBI{
    public void findRate(){
        System.out.println(9);
    }

    public static void main(String[] args) {
        Bank bank = new Concept3();
        bank.findRate();
    }
    
}
