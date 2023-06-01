public class Student {
    private String name;
    private String address;
    private String sex;
    private int score;
    
    public Student(String name, String address, String sex, int score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getSex() {
        return sex;
    }
    
    public int getScore() {
        return score;
    }
    
    public static class StudentOperator {
        private Student student;
        
        public StudentOperator(Student student) {
            this.student = student;
        }
        
        public void print() {
            System.out.println("Student [" + student.getName() + ", " + student.getAddress() 
                + ", " + student.getSex() + ", " + student.getScore() + "]");
        }
        
        public String type() {
            if (student.getScore() > 8) {
                return "A";
            } else if (student.getScore() >= 5 && student.getScore() <= 8) {
                return "B";
            } else {
                return "C";
            }
        }
    }
    
    public static void main(String[] args) {
        Student s = new Student("John", "123 Main St", "Male", 7);
        StudentOperator so = new StudentOperator(s);
        so.print();
        System.out.println("Rank: " + so.type());
    }
}
