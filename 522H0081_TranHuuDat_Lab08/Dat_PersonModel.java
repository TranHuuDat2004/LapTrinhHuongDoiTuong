import java.util.ArrayList;
    public class Dat_PersonModel <T> {
        private ArrayList<T> al = new ArrayList<T>();
        public void add(T obj) {
            al.add(obj);
        }
        public void display() {
            for (T obj : al) {
                System.out.println(obj);
        }
    }
        Dat_Student s1 = new Dat_Student();
        Dat_Student s2 = new Dat_Student("Abc", 2022, 1, 100);
        
        Dat_Employee e1 = new Dat_Employee();
        Dat_Employee e2 = new Dat_Employee("Xyz", 2000, 100, 2.34);

        Dat_Person p1 = new Dat_Person();
        Dat_Person p2 = new Dat_Person("Huu Dat",2004);
}
    
