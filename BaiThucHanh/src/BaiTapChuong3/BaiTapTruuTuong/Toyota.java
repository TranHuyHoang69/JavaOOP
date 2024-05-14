package BaiTapChuong3.BaiTapTruuTuong;

public class Toyota implements HangXe {
    public void ten(){
        System.out.println("Toyota Camry");
    }
    public void gia(){
        System.out.println("1.1 ty vnd");
    }
    public void soluongbanra(){
        System.out.println("1000");
    }
    public static void main(String[] args) {
        Toyota ty = new Toyota();
        ty.ten();
        ty.gia();
        ty.soluongbanra();
    }
}
