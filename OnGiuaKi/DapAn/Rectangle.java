public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len){
       setColor(color);
	   setLength(len);
	   setName(name);
	   setWidth(wid);
    }

    public String getName(){
        //sinh vien viet code tai day va sua lai gia tri return
        return this.name;
    }

    public String getColor(){
        //sinh vien viet code tai day va sua lai gia tri return
        return this.color;
    }

    public double getWidth(){
        //sinh vien viet code tai day va sua lai gia tri return
        return this.width;
    }
    public double getLength(){
        //sinh vien viet code tai day va sua lai gia tri return
        return this.length;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setColor(String color){
        //sinh vien code tai day
		this.color=color;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getPerimeter(){
        //sinh vien viet code tai day va sua lai gia tri return
        return (width + length)*2;
    }

    public String getType(){
        //sinh vien viet code tai day va sua lai gia tri return
		double dt=width*length;
        if(dt>=10) return "A";
		if(dt>=5) return "B";
		return "C";
    }
	
	public boolean isSquare(){
        //sinh vien viet code tai day va sua lai gia tri return
        return width==length;
    }

    public double calDiagonalLine(){
        //sinh vien viet code tai day va sua lai gia tri return
        return Math.sqrt(width*width + length*length);
    }

    public Rectangle resize(double rate){
         //sinh vien viet code tai day va sua lai gia tri return
         Rectangle kq=new Rectangle(name,color, width*rate, length*rate);
		 return kq;
    }

    public String toString(){
        //sinh vien viet code tai day va sua lai gia tri return
        return "Rectangle["+name + ", " + length +", "+width+", " 
		+width*length+", " + getType()+"]";
    }
}