public class Dat_Point {
    protected int x;
    protected int y;

    public Dat_Point(){
        this.x = 1; 
        this.y = 1;
    }

    public Dat_Point(int x, int y){
        setX(x);
        setY(y);
    }  

    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double distance(int x, int y){
        return Math.sqrt((x*x + y*y));
    }

    public String toString(){
        return "Person [ x:" + getX() + ", " +"y:"+ getY()+"]";
    }

}
