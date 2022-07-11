package NewJavaConcept;

public class parentClass {
    void show(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        parentClass ne = new parentClass();
        ne.show();

    }
}


class ChildClass extends parentClass{
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.show();
    }
}

class Fellow{
    void findSum(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Fellow fw = new Fellow();
        fw.findSum(2,3);
    }
}
