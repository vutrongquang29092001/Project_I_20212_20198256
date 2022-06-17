package project__i.tuan33;

import java.util.ArrayList;
import java.util.List;



public class QuanLySach
{
   
    static List<TaiLieu> dsTaiLieu;

    
    public QuanLySach() {
      
        if(dsTaiLieu == null) {
            dsTaiLieu = new ArrayList<TaiLieu>();
            exampleData();
        }
    }

    private void exampleData() { 
        // Báo
        dsTaiLieu.add(new Bao("B001", "NXB_1", 12, "29/09/2022"));
        dsTaiLieu.add(new Bao("B002", "NXB_2", 15, "13/9/2022"));
        dsTaiLieu.add(new Bao("B0033", "NXB_3", 34, "30/09/2022"));
        // Sách
        dsTaiLieu.add(new Sach("S001", "NXB_A", 23, "Vũ Trọng A", 51));
        dsTaiLieu.add(new Sach("S002", "NXB_B", 51, "Vũ Trọng B", 15));
        dsTaiLieu.add(new Sach("S003", "NXB_C", 10, "Vũ Trọng C", 10));
        // Tạp chí
        dsTaiLieu.add(new TapChi("T001", "NXB_2", 2, 10, "7/2022"));
        dsTaiLieu.add(new TapChi("T002", "NXB_1", 3, 5, "9/2022"));
        dsTaiLieu.add(new TapChi("T003", "NXB_D", 1, 1, "12/2022"));
    }


    public List<TaiLieu> getDsTaiLieu() {
        return dsTaiLieu;
    }

    
    public boolean themTaiLieu(TaiLieu tl) {
       
        for(TaiLieu taiLieu : dsTaiLieu) {
            if(taiLieu.getMaTaiLieu().equals(tl.getMaTaiLieu())) {
                return false;
            }
        }
     
        return dsTaiLieu.add(tl);
    }

 
    public boolean xoaTaiLieu(String maTL) {
        int index = 0;
        
        for(; index < dsTaiLieu.size(); index++) {
            if(dsTaiLieu.get(index).getMaTaiLieu().equals(maTL)) {
                break;
            }
        }
      
        if(index == dsTaiLieu.size()) {
            return false;
        }
        else {
            dsTaiLieu.remove(index);
            return true;
        }
    }

  
    public boolean capNhatTaiLieu(String tlBefore, TaiLieu tlAfter) {
        
        if(! tlBefore.equals(tlAfter.getMaTaiLieu())) {
            for(TaiLieu tl : dsTaiLieu) {
                if(tl.getMaTaiLieu().equals(tlAfter.getMaTaiLieu())) {
                    return false;
                }
            }
        }
       
        for(TaiLieu tl : dsTaiLieu) {
            if(tl.getMaTaiLieu().equals(tlBefore)) {
                int index = dsTaiLieu.indexOf(tl);
                dsTaiLieu.set(index, tlAfter);
                return true;
            }
        }

        return false;
    }

  
    public void hienThi() {
        for(TaiLieu tl : dsTaiLieu) {
            tl.hienThi();
        }
    }

  
    public void hienThi(String loaiTL) {
        for(TaiLieu tl : dsTaiLieu) {
            if(tl.loaiTaiLieu().equals(loaiTL)) {
                tl.hienThi();
            }
        }
    }

   
    public void thoat() {
        System.exit(0);
    }

}
