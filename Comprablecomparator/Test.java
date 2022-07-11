package Comprablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int rollNo;
    private String id;

    Student(String name, int age, int rollNo, String id){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.id = id;
    }

    // @Override
    // public int compareTo(Student obj) { // sorting on the basis of age
    //     if(age > obj.age){
    //         return 1;
    //     } else if(age < obj.age){
    //         return -1;
    //     }else{
    //         return 0;
    //     }
    
    // }
    @Override
    public int compareTo(Student obj) { // sorting on the basis of name
       Student st = (Student)obj;
       String name = st.name;
       return this.name.compareTo(name); // this.name represent object of current object and here we are comparing two instance name on the basis of their ASCII value
    
    }

    // @Override
    // public String toString() {
    //     return "Student [age=" + age + ", id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
    // }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getId(){
        return id;
    }

   

}


public class Test{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Aakhir", 24, 01, "@#$100"));
        list.add(new Student("Farida", 25, 07, "@#$101"));
        list.add(new Student("Sufi", 26, 03, "@#$105"));
        list.add(new Student("jai", 27, 10, "@#$106"));
        list.add(new Student("firjo", 23, 05, "@#$103"));
        list.add(new Student("Aftab", 22, 06, "@#$104"));
        list.add(new Student("Daniyal", 21, 02, "@#$107"));
        list.add(new Student("Owais", 29, 04, "@#$108"));


        // System.out.println(" without sorting " + list);
        // list.stream().forEach(System.out :: println);
        list.forEach(e->{
            System.out.println(e.getName() + " " + e.getAge()+ " " + e.getRollNo() + " " + e.getId());
        });

        Collections.sort(list);
        System.out.println("**********************************");

        list.forEach(e->{
            System.out.println("[ " + e.getName() + " " + e.getAge()+ " " + e.getRollNo() + " " + e.getId() + " ]");
        });
    }
}
