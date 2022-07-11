package NewJavaConcept;


class Department{
    String name;
    Integer ranValue;

    Department(String name, Integer ranValue){
        this.name = name;
        this.ranValue = ranValue;
    }

    // Department(){
        // super();
    // }

    float getDeptId(Integer ranValue){
        return ranValue*(5/3);
    }
}
public class Concept4 extends Department {
    Concept4(String name, Integer ranValue) {
        super(name, ranValue);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args){
        // Department d = new Department();
        Department d = new Department("Production Department", 25);

        System.out.println(d.name + d.ranValue);
        // System.out.println(d);
    }
}
