package Test2;
// import java.util.*; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Comparat {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(107,"Afro Alam", 34));
        list.add(new Student(105,"Jai", 45));
        list.add(new Student(109,"Akhir", 35));

        
        System.out.println("sort the student on the basis of age");
        Collections.sort(list, new AgeComparator());

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sort the student on the basis of name");

        Collections.sort(list, new NameComparator());
        Iterator itr1 = list.iterator();
        while(itr1.hasNext()){
            Student st = (Student)itr1.next();
            System.out.println(st.age+" "+st.name+" "+st.age);
        }
        
    }


}

class Student{
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator{
    

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if(s1.age == s2.age){
            return 0;
        }else if(s1.age > s2.age){
            return 1;
        }else{
            return -1;
        }
        
    }
}

class NameComparator implements Comparator{
    

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student) o2;

        return s1.name.compareTo(s2.name);
    }

}
