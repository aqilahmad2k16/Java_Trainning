package Comprablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
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

        System.out.println("**********************************");
        // after sorting by name
        Collections.sort(list, new NameComparator());

        

        list.forEach(e->{
            System.out.println("[ " + e.getName() + " " + e.getAge()+ " " + e.getRollNo() + " " + e.getId() + " ]");
        });

        // sort by age
        
        System.out.println("**********************************");
        Collections.sort(list, new AgeComparator());

       

        list.forEach(e->{
            System.out.println("[ " + e.getName() + " " + e.getAge()+ " " + e.getRollNo() + " " + e.getId() + " ]");
        });


    }
}

class Student{
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


// sort by name
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        
        return s1.getName().compareTo(s2.getName());
    }

}

// sort by age
class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAge() > s2.getAge()){
            return 1;
        }else if(s1.getAge() < s2.getAge()){
            return -1;
        }else{
            return 0;
        }
        
    }
    
}
