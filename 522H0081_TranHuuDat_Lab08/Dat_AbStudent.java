public abstract class Dat_AbStudent {
    protected String sName;
    protected double gpa;


    public Dat_AbStudent(){
        this.sName = "Dat";
        this.gpa = 9.9;
    }
    public Dat_AbStudent(String sName, double gpa){
        this.sName = "Dat";
        this.gpa = 9.9;
    }

    public void setSName(String sName){
        this.sName = sName;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public String getSName(){
        return this.sName;
    }

    public double getGpa(){
        return this.gpa;
    }
    public abstract String getRank();
    public abstract String toString();
}
