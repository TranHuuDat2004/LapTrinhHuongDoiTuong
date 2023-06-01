public class Dat_Student extends Dat_Person{
    private int id;
    private double gpa;
    //Constructor
    public Dat_Student (){
        super();
        this.id = 1;
        this.gpa = 0;
    }
    public Dat_Student (String name, int year, int id, double gpa){
        super(name, year);
        setId(id);
        setGpa(gpa);
    }
    public void setId(int id){
        this.id = id;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public int getId(){
        return this.id;
    }

    public double getGpa(){
        return this.gpa;
    }

    public String toString(){
        return "Student [ name:" + getName() + ", " +
        "id:"+ getId()+ ", " +
        "gpa:"+ getGpa()+
        "]";
    }
    
}
