import java.util.HashMap;
import java.util.Scanner;
public class TranHuuDat_B5 {

    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        String hihi = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call" + 
        "a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it";
        HashMap < String, Integer > bangBam=new HashMap();
        String [] cat = hihi.split(" ");
        for (String x:cat){
            if (bangBam.get(x)==null)
                bangBam.put(x, 1);
            else 
                bangBam.put(x,bangBam.get(x)+1);
                // neu x da co trong bangBam thi tang so luong length, neu chua co thi them moi
        }
        for(String x:bangBam.keySet())
            System.out.println(x + " " + bangBam.get(x));
        sc.close();
    }



}
