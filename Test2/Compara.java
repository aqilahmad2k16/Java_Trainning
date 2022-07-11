package Test2;

import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }


    public int compareTo(Student st){
        if(age == st.age){
            return 0;
        }else if(age < st.age){
            return 1;
        }else{
            return -1;
        }
    }
}

public class Compara {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(107,"Afro Alam", 34));
        list.add(new Student(105,"Jai", 45));
        list.add(new Student(109,"Akhir", 35));

        Collections.sort(list);

        for(Student st : list){
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        

    }

}

