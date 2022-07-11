package ObjectClassMethod;

import javax.lang.model.util.ElementScanner6;

public class ToString implements Cloneable{
    private int id;
    private String name;

    ToString(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    // we override toString()
    public String toString(){
        return "id "+ id + " " + name + " name";
    }

    //override hashcode();
    public int hashCode(){
        return id;
    }

    // override equals() method
    public boolean equals(Object obj){
        ToString s4 = (ToString)obj;
        try{

            if(name.equals(s4.getName()) && id == s4.getId())return true;
            else return false;
        }
        catch(Exception e){
            return false;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ToString st = new ToString(5, "Ayan");
        ToString s1 = new ToString(4, "Islam");
        ToString s2 = new ToString(5, "Ayan");
        ToString s3 = st;

        // toString() method:*********************************

        // System.out.println(st);// this will return address of the object rather properties of object
        // System.out.println(st.toString()); print ToString@45213586(this is memory address)

        // in order to provide the properties of object we will have override the toString() method of object class in order to provide our own implementation

        // after override toString()

        // System.out.println(st);
        // System.out.println(st.toString());

        // Hashcode() method :************************************************
         // by default jvm provide memory address as hashcode as unique number to object using Hashcode() of object but we can override to create our own unique id of object based on the property we want


         // without override hashcode method
        //  System.out.println(st.hashCode()); // will print memory address of object

         // after override this method
        //  System.out.println(st.hashCode());

        // equals() method:*******************
        // used to check the equality of two object, 
        // by default when we compare two object using equals() method it will check on the basis of references address whether thier memory address are equal or not(this == obj) equal to equal to operator

        // without override this method
        // System.out.println(st.equals(s1)); // false
        // System.out.println(s1.equals(s2));// false
        // System.out.println(s3.equals(st));// true chekc equality on the basis of reference addresss is same or not
        
        
        // this will compare on the basis of reference address but here, we have two separate object having different memory address so it will return false

        // if we want to content comparision if both object have same content then it will return true else false
        // in order to make it such that it'll return true, we will have to override this mehtod and provide our own implementation

        // after ovrride equals method
        // System.out.println(st.equals(s2));// true
        // System.out.println(st.equals(s3));// true
        // System.out.println(s1.equals(s3));// false
        // System.out.println(s1.equals(s2));// false


        // finallize() method
        // called by garbage collector on an object when garbage collection determines that there are no references to an object
        // protected void finallize() throws throwable


        // getClass() method
        // returns the runtime class of this object. the returned class object is the object that is locked by static synchronized methods of the represented class 

        // public final class<?> getClass()

        // System.out.println(s1.getClass().getName()); // return name of s1 class 
        // that is "ObjectClassMethod.ToString"

        // clone() method 
        // used to create and return the copy/duplicate of this object
        // also we can clone those object which is clonabel it means class of that object must implement clonable interface otherwise it will throw clonenotsupportedException


        // without class implement cloneable interface and it will thow expceptoin
        // ToString s5 = (ToString)s3.clone();// throw CloneNotSupportException

        // after implemented cloneable object
        ToString s6 = (ToString) s3.clone();// THIS WILL work
        System.out.println(s6);

        // cloneable is marker interface which is empty interface which does not hav any abstract method, it's tag that tells to JVM that this class is implementing this interface, do the required thigs for it like in this case clone this object

        // clone() support two types of cloning 
        // namely: shallow cloning: bit wise creating copy of the object is called shallow cloning (if main object contain premitive value, then exact copy that object will form)
        // when we make any changes to original object it won't reflect into clone object
        // but if main class has object of other class or we change it's content then it'll reflect in both the object clone object as well as original object that should'nt be like that so in order to overcome this problem we can do deep cloning of the object
        // deep cloning: the process of creating exjacly independently duplicate object of original object.     




    }


}
