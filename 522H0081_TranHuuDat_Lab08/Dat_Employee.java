public class Dat_Employee extends Dat_Person{
    private int id;
    private double salary;
    //Constructor
    public Dat_Employee (){
        super();
        this.id = 1;
        this.salary = 0;
    }
    public Dat_Employee(String name, int year, int id, double salary){
        super(name, year);
        setId(id);
        setSalary(salary);
    }
    public void setId(int id){
        this.id = id;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public double getSalary(){
        return this.salary;
    }

    public String toString(){
        return "Student [ name:" + getName() + ", " +
        "year:"+ getYear()+ ", " +
        "id:"+ getId()+ ", " +
        "salary:"+ getSalary()+
        "]";
    }
}