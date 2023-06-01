public class Dat_Test1 {
    public static void main (String [] args){
        Dat_Employee e1 = new Dat_Employee("Dat", 2004, 100, 2.34);
        Dat_Person p1 = new Dat_Person();
        Dat_Student s1 = new Dat_Student("Abc", 2023, 1, 100);

        System.out.println(e1);
        System.out.println(p1);
        System.out.println(s1);
    }    
}
