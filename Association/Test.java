package Association;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Professor> list = new ArrayList<>();
        list.add(new Professor("Anuz"));
        list.add(new Professor("Firoj"));
        list.add(new Professor("Archana"));
        list.add(new Professor("Vijay"));
        list.add(new Professor("Daniyal"));
        list.add(new Professor("Hamza"));

        List<Professor> list1 = new ArrayList<>();
        list1.add(new Professor("Mehboob"));
        list1.add(new Professor("Shamim"));
        list1.add(new Professor("Shakeel"));
        Department dp = new Department("IT", list);
        Department dp1 = new Department("Commers", list1);

        System.out.println("1st Department " + dp.getName());
        System.out.println(dp.getListOfProfessor().toString());
        System.out.println("*****************************************************************");
        System.out.println("2nd Department " + dp1.getName());
        System.out.println(dp1.getListOfProfessor().toString());
    }
}

// this is one to many mapping (Association)

class Professor{

    
    private String name;

    Professor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Department{
    private String name;
    List<Professor> professor;
    

    Department(String name, List<Professor> list){
        this.name = name;
        this.professor = list;
    }

    public String getName(){
        return name;
    }

    public List<String> getListOfProfessor(){
        List<String> plist = new ArrayList<>();
        professor.forEach(e->{
            plist.add(e.getName());
        });
        return plist;
    }
}
