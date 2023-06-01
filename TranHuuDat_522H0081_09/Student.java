import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // getters
    public void getName(String name){
        this.name =  name;
    }

    public void getId(String id){
        this.id = id;
    }

    public void getGpa(double gpa){
        this.gpa = gpa;
    }
    // setters
    public String setName(){
        return this.name;
    }

    public String setId(){
        return this.id;
    }

    public double setGpa(){
        return this.gpa;
    }

    public static void main(String[] args) {
        // create some Student objects and add them to an ArrayList
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "001", 3.5));
        students.add(new Student("Alice", "002", 3.2));
        students.add(new Student("Bob", "003", 3.9));

        // write the ArrayList to a file
        writeFile("students.txt", students);
    }

    public static <E> boolean writeFile(String path, ArrayList<E> lst) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (E e : lst) {
                writer.write(e.toString());
                writer.newLine();
            }
            writer.close();
            return true;
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return name + " - " + id + " - " + gpa;
    }
}


