package project__i.tuan33;


public class Bao extends TaiLieu
{
    String ngayPhatHanh;

   
    public Bao(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

  
    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

  
    public String loaiTaiLieu() {
        return "BAO";
    }

   
    public void hienThi() {
        super.hienThi();
        System.out.print(", Ngày phát hành: " + ngayPhatHanh + ".\n");
    }

}
