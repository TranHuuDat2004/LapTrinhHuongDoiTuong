class TestRectangle {
    public static void main(String[] args){
        Rectangle rec = new Rectangle("Ruby", "Red", 6, 8);
        Rectangle rec1 = new Rectangle("Ruby", "Red", -2, -5);
        //In loai hinh chu nhat        
        System.out.println(rec.getType());
        //In thong tin
        System.out.println(rec.toString());
        System.out.println(rec1.toString());
        //SV tu kiem tra them cac phuong thuc khac
    }
}
