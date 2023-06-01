
public class Dat_Calculator{
    private int a;
    private int b;
    
    public Dat_Calculator(){
        this.a = 0;
        this.b = 0;
    }

    public Dat_Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getB(){
        return a;
    }

    public void setB(int b){
        this.b = b;
    }

    public double divide(int a, int b) throws NumberOutOfRangeException, ArithmeticException{
        if(b == 0)  throw new ArithmeticException("divided by zero");         
        if(a < -1000 || a > 1000 || b < -1000 || b > 1000){
            throw new NumberOutOfRangeException("Number out range");
        }
        else
            return (double)a*1.0/b;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException{
        if(a < -1000 || a > 1000 || b < -1000 || b > 1000){
            throw new NumberOutOfRangeException("Number out range");
        }
        return a*b;
    }

}