package NewJavaConcept;
// when two interface having same method with same name and singnature is implements by a child-class 
interface SBI{
    void rate(int factor);
}

interface Axis{
    void rate(int factor);
}

public class Concept2 implements SBI, Axis {
    public void rate(int factor){
        System.out.println(100 * factor);
    }

    public static void main(String[] args) {
        Concept2 bnk = new Concept2();
        bnk.rate(25);
    }

}
