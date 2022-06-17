package project__i.tuan33;



public class TapChi extends TaiLieu
{
    int soPhatHanh;
    String thangPhatHanh;

   
    public TapChi(int soPhatHanh, String thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

  
    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    
    public String loaiTaiLieu() {
        return "TAP_CHI";
    }

    public void hienThi() {
        super.hienThi();
        System.out.print(", Số phát hành: " + soPhatHanh + ", Tháng phát hành: " + thangPhatHanh + ".\n");
    }

}
