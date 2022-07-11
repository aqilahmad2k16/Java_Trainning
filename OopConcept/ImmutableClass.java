package OopConcept;
// first make the class final
// make all the properties private and final
// set the value of properties by using constructor
// don't use setter for setting properties
// when using object from other class which is mutable, always create deep copy of that
public final class ImmutableClass {
    // class person
    private final String name;
    private final int age;
    private final Engine engine;

    public ImmutableClass(final String name, final int age, Engine engine){
        this.name = name; // we know premitive is copy by value
        this.age = age;
        // this.engine = engine; //but here object is copy by reference of original class// here we are creating sallow copy that (original object) this will reflect the change in the field i.e speed
        Engine newEngine = new Engine(engine.speed); 
        // createing deep copy(dupblicate of engine object) and if we change to it won't reflect into immutable class
        this.engine = newEngine;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {

       
        Engine e = new Engine("25 km/h");
        ImmutableClass obj1 = new ImmutableClass("Firoj", 23, e);
        // ImmutableClass obj2 = new ImmutableClass("Surya", 25); when we change it's field a new object is form
        // e.speed = "30 km/h";
        System.out.println(obj1.getName() + " " + obj1.getAge() + " " + obj1.engine.speed);

        // System.out.println(obj2.getName() + " " + obj2.getAge());// here, new object obj2 is form
        // obj1.name = "Surya";

    }

    //other class engine which is mutable
    class Engine{
        String speed;

        public Engine(String speed){
            this.speed = speed;
        }
    }
}
