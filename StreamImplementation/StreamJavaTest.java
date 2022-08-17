package StreamImplementation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private int empid;
    private String name;
    private int depid;
    private String status = "active";
    private int salary;

    Employee(int empid, String name, int depid, String status, int salary){
        this.empid = empid;
        this.name = name;
        this.depid = depid;
        this.status = status;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [depid=" + depid + ", empid=" + empid + ", name=" + name + ", salary=" + salary + ", status="
                + status + "]";
    }

   

    
}
public class StreamJavaTest {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101, "Surya", 1008, "active", 15000));
        emp.add(new Employee(102, "Jai", 1007, "active", 25000));
        emp.add(new Employee(103, "Karan", 1007, "active", 35000));
        emp.add(new Employee(104, "SK Chaudhary", 1007, "active", 30000));
        emp.add(new Employee(105, "Shruti", 1008, "inactive", 35000));
        emp.add(new Employee(106, "Rehman", 1007, "active", 15000));


        // print employee details based on the department
        // emp.stream().collect(Collectors.groupingBy(Employee::getDepid, Collectors.toList())).entrySet().forEach(e->System.out.println(e.getKey() + " " + e.getValue()));

        // no of employee in each department

        // emp.stream().collect(Collectors.groupingBy(Employee::getDepid, Collectors.counting())).entrySet().forEach(e->System.out.println(e.getKey() + " " + e.getValue()));

        // WAP to print no of active and inactive employee in list

        // emp.stream().collect(Collectors.groupingBy(Employee::getStatus, Collectors.counting())).entrySet().forEach(e->System.out.println(e.getKey() + " " + e.getValue()));

        //WAP to print max and min salary of employee from each group

        // System.out.println(emp.stream().max(Comparator.comparing(Employee::getSalary)));
        // System.out.println(emp.stream().min(Comparator.comparing(Employee::getSalary)));

        //WAP find the max salary from each department
        System.out.println(emp.stream().collect(Collectors.groupingBy(Employee::getDepid, Collectors.maxBy(Comparator.comparing(Employee::getSalary)))));

        // similary find the minimum salary from each department
        System.out.println(emp.stream().collect(Collectors.groupingBy(Employee::getDepid, Collectors.minBy(Comparator.comparing(Employee::getSalary)))));


      

    }
}
