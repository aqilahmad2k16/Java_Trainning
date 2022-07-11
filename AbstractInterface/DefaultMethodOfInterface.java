package AbstractInterface;

public class DefaultMethodOfInterface {
    public static void main(String[] args) {
        // what is default method?
        // Default methods are methods that can have a body,The most important use of
        // default methods in interfaces is to provide additional functionality to a
        // given type without breaking down the implementing classes.

        // Before Java 8, if a new method was introduced in an interface then all the
        // implementing classes used to break. We would need to provide the
        // implementation of that method in all the implementing classes.

        // However, sometimes methods have only single implementation and there is no
        // need to provide their implementation in each class. In that case, we can
        // declare that method as a default in the interface and provide its
        // implementation in the interface itself.

        Yes ys = new Yes();
        Hello hl = new Yes();

        ys.findTheWay();
        ys.sayHello();
        System.out.println("*************************************");
        hl.findTheWay();
        hl.sayHello();
    }
}

interface Hello{
    void findTheWay();

    default void sayHello(){
        System.out.println("Hey there! ........");
    }
    
}

class Yes implements Hello{
    public void findTheWay(){
        System.out.println("new way of life.....");
    }


}