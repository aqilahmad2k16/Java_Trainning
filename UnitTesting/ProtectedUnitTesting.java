package UnitTesting;

public class ProtectedUnitTesting {
    // To test the protected method, the test class is declared in the same package as the target class
    
    protected int Sum(int a, int b){
        return (a+b);
    }

    protected int Cube(int a, int b, int c){
        return a*b*c;
    }
}
