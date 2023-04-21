public class JavaBasic{
    public static int sumNegativeElements(int a[]){
		int tong=0;
        for(int x:a)
			if(x<0)
				tong=tong+x;
		return tong;
    }

    public static String uppercaseFirstVowels(String str){
        //sinh vien code tai day
		String na="euoai";
		StringBuffer kq=new StringBuffer();
		if(na.indexOf(str.charAt(0))!=-1)
			kq.append(Character.toUpperCase(str.charAt(0)));
		for(int i=1;i<str.length();i++)
			if(str.charAt(i-1)==' ' && na.indexOf(str.charAt(i))!=-1)
				kq.append(Character.toUpperCase( str.charAt(i)));
			else
				kq.append(str.charAt(i));
		return kq.toString();
    }
	
	public static int findMinNegativeElement(int a[]){
        //sinh vien code tai day
		int vt=-1;
		for(int i=0;i<a.length;i++)
			if(a[i]<0)
			{
				vt=i;
				break;
			}
		if(vt==-1) return -1;
		int vtmin=vt;
		for(int i=vt+1;i<a.length;i++)
			if(a[i]<0 && a[i]<a[vtmin])
				vtmin=i;
		return vtmin;
    }
	
	public static String getName(String str){
        //sinh vien code tai day
		return str.substring(8);
    }

    public static int findFirstMod3Element(int[] a){
		for(int i=0;i<a.length;i++)
			if(a[i]%3==0)
			{
				return i;
			}
		return -1;
    }

    public static int countString(String str, String k){
        //sinh vien code tai day
		str=str.toLowerCase();
		k=k.toLowerCase();
		int vt=-1;
		int dem=0;
		do
		{
			vt=str.indexOf(k,vt+1);
			if(vt!=-1)
				dem++;
			
		}while(vt!=-1);
		return dem;
    }

    public static void main(String[] args){
        int[] a = {1,-2,3,4,-2,1,-9};
        //sinh vien code tai day
		System.out.println(sumNegativeElements(a));
		System.out.println(findFirstMod3Element(a));
		System.out.println(findMinNegativeElement(a));
        String s = "nguyen thi uyen an";
        //sinh vien code tai day
		System.out.println(uppercaseFirstVowels(s));
		String s1 = "Ho ten: Nguyen Thi Anh Dao";
		//sinh vien code tai day
		System.out.println(getName(s1));
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
		//sinh vien code tai day
		System.out.println(countString(s2,"Phuong"));
    }

}