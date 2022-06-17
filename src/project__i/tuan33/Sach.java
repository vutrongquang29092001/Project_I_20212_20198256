package project__i.tuan33;

public class Sach extends TaiLieu
{
    String tenTG;
    int soTrang;

    
    public Sach(String tenTG, int soTrang) {
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTG, int soTrang) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

  
    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

   
    public String loaiTaiLieu() {
        return "SACH";
    }

    
    public void hienThi() {
        super.hienThi();
        System.out.print(", Tác giả: " + tenTG + ", Số trang: " + soTrang + ".\n");
    }

}
