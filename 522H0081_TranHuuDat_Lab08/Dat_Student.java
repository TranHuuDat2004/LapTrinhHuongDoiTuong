public class Dat_Student extends Dat_Person{
    private int id;
    private double score;
    //Constructor
    public Dat_Student (){
        super();
        this.id = 1;
        this.score = 0;
    }
    public Dat_Student (String name, int year, int id, double score){
        super(name, year);
        setId(id);
        setScore(score);
    }
    public void setId(int id){
        this.id = id;
    }
    
    public void setScore(double score){
        this.score = score;
    }

    public int getId(){
        return this.id;
    }

    public double getScore(){
        return this.score;
    }

    public String toString(){
        return "Student [ name:" + getName() + ", " +
        "year:"+ getYear()+ ", " +
        "id:"+ getId()+ ", " +
        "score:"+ getScore()+
        "]";
    }
}
