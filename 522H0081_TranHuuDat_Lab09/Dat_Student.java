import java.io.*;
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
    public static void main(String[] args) {        
        Dat_Student s1 = new Dat_Student("Dat", 2004, 1001, 7.97);
        Dat_Student s2 = new Dat_Student("Vinh", 2000, 1002, 9.9);
        try {
            // Create output.txt file
            FileWriter output = new FileWriter("Output_Student.txt");            
            output.write(s1.toString() + "\n");            
            output.write(s2.toString()+ "\n");
            
            // Close files
            
            output.close();

            System.out.println("Da tao file output thanh cong.");
        }
        catch (IOException e) {
            System.out.println("Da xay ra loi khi ghi tep.");
            e.printStackTrace();
        }
    }
}
