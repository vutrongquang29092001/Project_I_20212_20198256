package project_i.tuan33;


public class TaiLieu
{
    String maTaiLieu, tenNXB;
    int soBanPhatHanh;

 
    public TaiLieu() {
    }

 
    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

   
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    
    public String loaiTaiLieu() {
        return "TAI_LIEU";
    }

  
    public void hienThi() {
        System.out.print("- Mã tài liệu: " + maTaiLieu + ", Nhà xuất bản: " + tenNXB + ", Số bản phát hành: " + soBanPhatHanh);
    }

}
