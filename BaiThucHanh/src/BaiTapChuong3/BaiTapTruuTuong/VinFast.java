package BaiTapChuong3.BaiTapTruuTuong;

public class VinFast implements HangXe {
    public void ten(){
        System.out.println("VF8");
    }
    public void gia(){
        System.out.println("1 ty vnd");
    }
    public void soluongbanra(){
        System.out.println("5000 chiec");
    }
    public static void main(String[] args) {
        VinFast vf = new VinFast();
        vf.ten();
        vf.gia();
        vf.soluongbanra();
    }
}
