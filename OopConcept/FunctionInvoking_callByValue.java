package OopConcept;

public class FunctionInvoking_callByValue {
    // in java ther is only call by value 
    // call by value and call by reference
    // a function can be invoked in two ways : 
    // 1st Call by value 2nd Call by refernce

    //1st in call by value
    // the value of actual parameter(that we pass to any  function) are copied to function(formal paratmeter(value recieved by function)) and two types of parameter are store at two differnt memory location.

    // so any changes is made inside that function wont reflect in the actual one

    int data = 20;

    public void change(int data){
        data = data+100;
    }

    public static void main(String[] args) {// call by value
        FunctionInvoking_callByValue fi = new FunctionInvoking_callByValue();
        System.out.println("Before change " + fi.data);

        fi.change(100);

        System.out.println("After change " + fi.data);

        // both will give the same data i.e 20

        FunctionInvoking_callByValue nfi = new FunctionInvoking_callByValue();
        System.out.println("Before change " +nfi.value);

        nfi.change1(nfi);// passing object;

        System.out.println("after change " + nfi.value);

        // change will be reflect in the actual one as well
    }

    

    // Call by reference
    //both the actual and formal parameters refer to the same locations, so any changes made inside the function are actually reflected in actual parameters of the caller.
    // if we pass object in place of any primitive value, original value will be changed.
    //in this, we will passing object as a value

    int value = 200;
    public void change1(FunctionInvoking_callByValue nFi){
        nFi.value = nFi.value + 100; // changes will be in instance variable
    }

}


