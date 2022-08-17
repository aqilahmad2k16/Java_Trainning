package StreamImplementation;

class Emp{
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;
    public Emp(int id, String name, int age, String gender, String department, int yearOfJoining, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public Emp(){
        super();
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getDepartment(){
        return department;
    }

    public int getYearOfJoining(){
        return yearOfJoining;
    }

    public String get
}