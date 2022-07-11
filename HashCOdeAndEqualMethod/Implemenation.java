package HashCOdeAndEqualMethod;

public class Implemenation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(4);
        e1.setName("Ayan");

        Employee e2 = new Employee();
        e2.setId(4);
        e2.setName("Ayan");

        System.out.println("shallow copy "+ (e1 == e2));
        System.out.println("deep copy "+ e1.equals(e2));
    }
}

class Employee{
    private int id;
    private String name;

    


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
}
