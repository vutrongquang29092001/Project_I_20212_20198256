package project_i.tuan31;

public class Main_Tuan_31 {
    public static void main(String[] args){
    Bai_1 b1 = new Bai_1();
     int a[] = b1.input();
     a = b1.insertionSort(a);
     for(int i = 0; i < a.length; i++){
         System.out.print(a[i]+"\t");
     }
    }
}
