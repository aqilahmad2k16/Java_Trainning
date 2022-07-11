package Java8Features.FunctionalInterface;

import java.util.Comparator;

@FunctionalInterface
interface functionalInterface {
    void sayHello(int a);

    static int findSum(int a, int b) {
        return a + b;
    }

    default int findProduct(int a, int b) {
        return a * b;
    }
}

// class Game implements fucntionalInterface{ // here I am using a normal class
// and override that method but for different implements we have to create
// multiple class that will increase boilercode plate and that's not consider as
// good practice
// instead that we can use
// 1. anonymous class and
// 2. lamda expression

// @Override
// public Integer tokenGenerator(int rNo) {

// return 10*rNo;
// }

// }


interface Sum{
    public void findSum(int a, int b);
}
public class Test {
    public static void main(String[] args) {
        // Game fn = new Game();
        // System.out.println(fn.tokenGenerator(10));

        // first implementation of the method of functional interface provided by the
        // anonymous function

        // **************************8
        // we can give implementation of functionalInterface by anonymous class but
        // without using lamda expression
        // functionalInterface fn = new functionalInterface(){
        // public void sayHello(int a){
        // System.out.println("hey there! what's up" + a);
        // }
        // };

        // functionalInterface fn1 = new functionalInterface(){
        // public void sayHello(int a){
        // System.out.println("hey what's up? I'm cool" + a);
        // }
        // };

        // fn.sayHello(5);
        // fn1.sayHello(10);

        // we can also provide the functional interface implementation with lamda
        // expression

        // lamda expression is use to provide the implementation of functional interface
        // functionalInterface fn = (a)->{System.out.println("yup! "+ a);};
        // fn.sayHello(4);

        // functionalInterface fn1 = (b)->{System.out.println("hmm! " + b);};
        // fn1.sayHello(10);

        // static method inside functionalInterface
        // System.out.println(functionalInterface.findSum(10, 10));
        // System.out.println(functionalInterface.findProduct(10, 10));

        // Comparator<String> compar = (s1, s2)->s1.equals(s2);
        // System.out.println(compar.equals("Aqil", "Aqib"));
        // int sum = 0;
        // List<Integer> list = List.of(1, 5, 4, 6, 8, 15, 20);
        // // int tSum = list.stream().filter(entry->entry>10).mapToInt(entry->
        // // entry).sum();
        // // list.stream().filter(e -> e > 10).map(e -> e + sum);
        // String str = new String();

        // Sum i = (a,b)->{return a+b;};
        // System.out.println(i.findSum(2,3));

        Sum s = new Sum(){
            public void findSum(int a , int b ){
                System.out.println(a+b);
            }
        };

        s.findSum(2,5);
        // int val=0;
        // Comparator<String> st = (s1, s2)->{return s1.equals(s2);}.mapToInt(val->val).val1();

       



    }
}
