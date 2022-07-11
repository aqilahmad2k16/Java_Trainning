package Comprablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Aakhir", 24, 01, "@#$100"));
        list.add(new Student("Farida", 25, 07, "@#$101"));
        list.add(new Student("Sufi", 26, 03, "@#$105"));
        list.add(new Student("jai", 27, 10, "@#$106"));
        list.add(new Student("firjo", 23, 05, "@#$103"));
        list.add(new Student("Aftab", 22, 06, "@#$104"));
        list.add(new Student("Daniyal", 21, 02, "@#$107"));
        list.add(new Student("Owais", 29, 04, "@#$108"));

        list.forEach(e->{
            System.out.println(e.getName() + " "+ e.getId() + " " + e.getRollNo() + " " + e.getAge());
        });

        System.out.println("after sort");

        Collections.sort(list);

        list.forEach(e->{
            System.out.println(e.getAge() + " "+ e.getId() + " " + e.getRollNo() + " " + e.getName());
        });
    }
}

class Student implements Comparable<Student> {
    private String id;
    private int age;
    private int rollNo;
    private String name;

    Student(String name, int age , int rollNo, String id){
        this.id = id;
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;
    }

   

    public String getId(){
        return id;
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

    @Override
    public int compareTo(Student obj){
        if(age > obj.age){
            return 1;
        }else if(age < obj.age){
            return -1;
        }else{
            return 0;
        }
    }
}
