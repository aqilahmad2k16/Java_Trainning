package Recursion;


class Practice{
    int age = 34;
    static String name="Aqil Ahmad";

    void find(){
        System.out.println(name); // can non-static method can access static variable or non-static variable
    }

    static int cube(int x){
        return x*x*x;
    }
    public static void main(String[] args) {
        // System.out.println(age); // show error
        System.out.println(name);

        Practice ob=new Practice();
        System.out.println(ob.age); // only we can access non-static variable or method by createing object of that class
        ob.find();

        System.out.println("************************************");

        int cubeVal = Practice.cube(3);
        System.out.println(cubeVal);

    }
}