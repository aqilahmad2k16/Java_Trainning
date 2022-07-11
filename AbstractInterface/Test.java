package AbstractInterface;

// import javax.swing.plaf.synth.SynthSeparatorUI;

// class Car {

    
//     String wheel(){
//         return "4 wheelers";
//     }

//     String acFacility(){
//         return "AC is available";
//     }

//     String callFacility(){
//         return "calling is available";
//     }
// }

// class Toyota extends Car{
//     String wheel(){
//         return "5 wheeler";
//     }

//     String rating(){
//         return " 5.5 ";
//     }
// }
public class Test {
    public static void main(String[] args) {
        Toyota car = new Toyota();

        System.out.println(car.wheel());
        System.out.println(car.acFacility());

        // car.acFacility();

        // Car cr = new Car();
        Car ncr = new Toyota();
        System.out.println(ncr.wheel());

        // cr.callFacility();
        // System.out.println(cr.wheel());

        // cr.rating();// we can't call the child class method with object of parent class in normal extends class also if in future is some class want to give implement of of some class

        // with abstract class
        Car cr = new Toyota();
        // // Car hcr = new Hyundai();
        Toyota ycr = new Toyota();
        Hyundai hcr = new Hyundai();


        // for Toyota
        // reference variable of car class
        System.out.println("reference variable of parent class");
        cr.noOfSeats();
        cr.price();
        cr.mileage();
        cr.rating();
        cr.wheel();
        cr.acFacility();
        cr.callFacility();
        // cr.modelAvailable();

        // // object and reference variable of child class
        System.out.println("object and refernce variable of child");
         ycr.noOfSeats();
         ycr.price();
         ycr.mileage();
         ycr.rating();
         ycr.wheel();
         ycr.acFacility();
         ycr.callFacility();
         ycr.modelAvailable();

        //  // object of hyundai and reference variable of it
         System.out.println("object and refernce variable of child");
          hcr.noOfSeats();
          hcr.price();
          hcr.mileage();
          hcr.rating();
          hcr.wheel();
          hcr.acFacility();
          hcr.callFacility();
        //   hcr.modelAvailable();


    }
}


// here in abstract class and interface keeps it hide u don't know about the parent class and its method or implementation 

// for example:- car is abstract class, it's kept hidden from the customer but child class u know about 


abstract class Car {
    // some of the hidden methods which is differnt for different care it means there implement is different which is provided by this methods
    abstract String noOfSeats();
    abstract String mileage();
    abstract String price();
    abstract String rating();
    // abstract String GPS();// in abstract class as well as interface if there is abstract method then it's implementation is must and implementation is provided by child  class which extends it


    // common method of cars that generally have 
    String wheel(){
        return "4 wheelers";
    }
    
    String acFacility(){
        return "AC is available";
    }

    String callFacility(){
        return "calling is available";
    }
}

interface GPS{
    String gps();
}

class Toyota extends Car implements GPS{
    public String gps(){
        return "GPS available";
    }

    String rating(){
        return " 5.5 ";
    }

    String noOfSeats(){
        return "8";
    }

    String mileage(){
        return "250 cc";
    }

    String price(){
        return "7,50,000";
    }

    String modelAvailable(){
        return "B82532";
    }

   
}

class Hyundai extends Car{
    String rating(){
        return " 6 ";
    }

    String noOfSeats(){
        return "6";
    }

    String mileage(){
        return "220 cc";
    }

    String price(){
        return "10,50,000";
    }
}
