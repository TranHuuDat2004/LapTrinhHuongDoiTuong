public class Dat_MathStudent extends Dat_AbStudent {
    private String sID;
    public Dat_MathStudent(){
        super();
        this.sID = "100";
    }

    public Dat_MathStudent(String sName, double gpa, String sSID){
        super(sName, gpa);
        this.sID = "100";
    }
    public String getRank(){
        if (this.gpa <= 5 ) return "Passed";
        return "Failed";        
    }
    public void setSID(String sID){
        this.sID = sID;
    }

    public String getSID(){
        return this.sID;
    }
    public String toString(){
        return "Student [ name:" +getSName() + ", " +
        "gpa:"+ getGpa()+ ", " +
        "sID:"+ getSID()+ ", " +
        "]";
    }

    
}

