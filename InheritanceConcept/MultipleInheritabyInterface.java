package InheritanceConcept;

interface  A{
   void foo();
}

interface B{
    void foo();
}

interface C extends A,B{// a interface can extend more than one interface, compiler won't create any ambiguity because in interface we declare only method but not provide method implements. here implementation is provided by child class which extends it but in when 
    void Ahmad();
}

public class MultipleInheritabyInterface implements C {
    public void foo(){
        System.out.println("hello world");
    }

    public int sum(int a , int b){
        return (a+b);
    }

    public void Ahmad(){
        System.out.println("hello Aqil");
    }

   
    public static void main(String[] args) {
        MultipleInheritabyInterface obj = new MultipleInheritabyInterface();
        C c = new MultipleInheritabyInterface();
        obj.foo();
        obj.Ahmad();
        System.out.println("**********************************");
        c.foo();
        c.Ahmad();
        System.out.println("*************************************");
        A a = new MultipleInheritabyInterface();
        a.foo();
        System.out.println("*****************************************");
        System.out.println(obj.sum(4,5));
        // a.Ahmad(); this will throw compile time error
        
    }
}
