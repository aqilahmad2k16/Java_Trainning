package InheritanceConcept;

class AxisBank{
    String name;
    int  rate(){
        return 8;
    }
    String getName(){
        return name;
    }

    void foo(){
        System.out.println("hey there");
    }

    
}

class SbiBank{
    
    int rate(){
        return 11;
    }
    
    void foo(){
        System.out.println("class B");
    }
   
// }

// class RBIBank extends A , B {
    public static void main(String[] args) {
        // RBIBank sb = new RBIBank();
        // A b1 = new A("Aqil Ahmad");
        // B b2 = new B("aqil@gmail.com");
        // sb.rate(); // here compiler confused about which method he has to call I mean which method of class SBi and Axis;

        
    }
}
