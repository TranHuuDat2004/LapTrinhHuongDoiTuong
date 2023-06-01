
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
        if(a < -1000 || a > 1000 || b < -1000 || b > 1000){
            throw new NumberOutOfRangeException("Number is outside the computation");
        }
        else if(b == 0){
            ArithmeticException obj = new ArithmeticException("divided by zero");
            throw obj;
        }
        return (double)a/b;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException{
        if(a < -1000 || a > 1000 || b < -1000 || b > 1000){
            throw new NumberOutOfRangeException("Number is outside the computation");
        }
        return a*b;
    }

    public static void main(String[] args) throws NumberOutOfRangeException{
        Dat_Calculator s1 = new Dat_Calculator();
        try{
            double kq = s1.divide(1, 0);
            System.out.println("Ket qua la"+ kq);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        Dat_Calculator s2 = new Dat_Calculator();
        try{
            int kq = s2.multiply(10000, 2);
            System.out.println("Ket qua la" + kq);
        }catch(NumberOutOfRangeException e){
            System.out.println(e.getMessage());
        }

        Dat_Calculator s3 = new Dat_Calculator();
        try{
            int kq = s3.multiply(10, 2);
            System.out.println("Ket qua la: "+ kq);
        }catch(NumberOutOfRangeException e){
            System.out.println(e.getMessage());
        }
    }
}