public class Dat_Test2 {
    public static void main (String [] args){
        Dat_Point p1 = new Dat_Point();
        Dat_Point p2 = new Dat_Point(10, 10);
        System.out.println(p1);
        System.out.println(p2);
    }
        public static double distance(Dat_Point p1, Dat_Point p2){
            return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
    }
}    


