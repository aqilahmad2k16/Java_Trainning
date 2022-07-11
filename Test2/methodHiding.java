package Test2;

class A{
    // static void sayHello(){
    //     System.out.println("here, we are going to call hello");
    // }
    // this is what we call method hiding, it means when we create reference variable of parent class and object of child class and when we call the static method then it will invoke method of parent class rather child class i.e, not overriding in fact it is method hiding

    void findSum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    private void sayhye(){
        System.out.println("Hello !");
    }
}

public class methodHiding extends A{
    // static void sayHello(){
    //     System.out.println("hey there! what's up");
    // }

    // void findSum(int a , int b, int c){
    //     System.out.println(a+b);
    // }

    private void sayhye(){
        System.out.println("Hello !");
    }
    
    public static void main(String[] args) {
        A a = new methodHiding();
        methodHiding mh = new methodHiding();
        // a.sayHello();
        a.findSum(3,3,3);
        mh.findSum(5,4,6);// when we are not providing the same method in the child class then this will invoke the method parent class else when we provide the method having same name and signature then it will override the method of parent class

        // a.sayhye();// show error that this method is not visible from class A. this is due to private access modifier is not accessible to outside of that class in which that method it's declared
        // methodHiding hm = new A();
        A p = new methodHiding();
        methodHiding nmh = (methodHiding)p;
        // mh.sayhye();
        nmh.sayhye();
    }
}
