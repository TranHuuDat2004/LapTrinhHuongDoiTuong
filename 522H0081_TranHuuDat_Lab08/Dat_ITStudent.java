public class Dat_ITStudent extends Dat_AbStudent {
    private int sID;
    public Dat_ITStudent(){
        super();
        this.sID = 1;
    }

    public Dat_ITStudent(String sName, double gpa, int sSID){
        super(sName, gpa);
        this.sID = 1;
    }
    
    public String getRank(){        
        if (this.gpa <= 5 ) return "C";
        else if (this.gpa<=8) return "B";
        return "A";
    }
    public void setSID(int sID){
        this.sID = sID;
    }

    public int getSID(){
        return this.sID;
    }
    public String toString(){
        return "Student [ name:" +getSName() + ", " +
        "gpa:"+ getGpa()+ ", " +
        "sID:"+ getSID()+ ", " +
        "]";
    }

    
}
