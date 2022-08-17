package OopConcept;

public class Employee {
    private int EmpId;
    private String name;
    private int age;

    public Employee(int EmpId, String name, int age){
        this.EmpId = EmpId;
        this.name = name;
        this.age = age;
    }

    Employee(Employee e){ // copy constructor
        EmpId = e.EmpId;
        name = e.name;
        age = e.age;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(12, "Ayan", 17);
        Employee e2 = new Employee(e1); // creating copy of object of the same class

        // why we do this? helpful when we want to copy a complex object that has several fields, or when we want to make a deep copy of an existing object
    }
}
