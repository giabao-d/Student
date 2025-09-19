package student;

import java.util.Scanner;

public abstract class SinhVien {

    private int maSV;
    private String hoTen;
    ;
    private String khoa;
    private float diemTB;
    Scanner s = new Scanner(System.in);

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    
    
    public float getDiemTB() {
        return diemTB;
    }

    public int getMaSV() {
        return maSV;
    }
    
    
    

    public void nhapThongTin() {
        System.out.print("Nhap ma sinh vien: ");
        maSV = s.nextInt();
        s.nextLine();
        System.out.print("Nhap ho va ten sinh vien: ");
        hoTen = s.nextLine();
        System.out.print("Nhap khoa dang hoc: ");
        khoa = s.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTB = s.nextFloat();
        s.nextLine();
    }

    public void capNhatThongTin() {
        System.out.print("Ho va ten sinh vien: ");
        hoTen = s.nextLine();
        System.out.print("Khoa dang hoc: ");
        khoa = s.nextLine();
        System.out.print("Diem trung binh: ");
        diemTB = s.nextFloat();
        s.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Khoa: " + khoa);
        System.out.println("Diem trung binh: " + diemTB);
    }

    public abstract void xetHocBong();
}
