import java.io.*;
public class Dat_Cau4 {
    public static void main (String[] args){
        String folder = "D:\\HUUDAT\\LapTrinhHuongDoiTuong\\522H0081_TranHuuDat_Lab09";
        String extention = "java";
        File f = new File(folder);
        String [] filenames = f.list();
        for (String file_name : filenames){
            if (file_name.endsWith("." + extention))
                System.out.println(file_name);
        }
    }
    
}
