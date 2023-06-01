public class Dat_Person{
    protected String name;
    protected int year;
    // Constructor
    public Dat_Person (){
        this.name = "Dat";
        this.year = 2004;
    }
    public Dat_Person (String name, int year){
        setName(name);
        setYear(year);
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setYear(int year){
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        return "Person [ name:" + getName() + ", " +"year:"+ getYear()+"]";
    }
}