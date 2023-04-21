public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len){
        setName(name);
        setColor(color);
        setWidth(wid);
        setLength(len);
    }

    public String getName(){ // lay ten
        return name;
    }

    public String getColor(){ // lay mau
        
        return color;
    }

    public double getWidth(){ // kiem tra chieu rong
        if(width>0)
            return width;
        return -1;
    }
    public double getLength(){ // kiem tra chieu dai
        if(length>0)
            return length;
        return -1;
    }

    public void setName(String name){ // nhap ten
        this.name = name;
    }

    public void setColor(String color){ // nhap mau
       this.color = color;
    }

    public void setWidth(double width){ // nhap chieu rong
        this.width = width;
    }

    public void setLength(double length){ // nhap chieu dai
        this.length = length;
    }

    public double getPerimeter(){ // tinh chu vi
        return 2 * (width + length);
    }

    public String getType(){ // xac dinh loai hinh chu nhat
        double area = width * length;
        if (area >= 10) {
            return "A";
        } else if (area >= 5) {
            return "B";
        } else {
            return "C";
        }
    }
	
	public boolean isSquare(){  // kiem tra co phai la hinh vuong       
        return width == length;
    }

    public double calDiagonalLine(){ // tinh duong cheo hinh chu nhat
        return Math.sqrt(width * width + length * length);
    }

    public Rectangle resize(double rate){ // tao kich thuoc moi
        return new Rectangle(name, color, width * rate, length * rate);
        
    }

    public String toString(){   
        return "Rectangle[" + name + ", " + length + ", " + width + ", " + (width * length) + ", " + getType() + "]";
    }
}