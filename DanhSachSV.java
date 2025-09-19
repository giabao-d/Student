package student;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSV {

    ArrayList<SinhVien> ds = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public void Nhap() {
        System.out.print("So sinh vien can nhap: ");
        int sl = s.nextInt();
        for (int i = 0; i < sl; i++) {
            System.out.println("Chon nganh sinh vien:");
            System.out.println("1: Sinh vien Ke Toan");
            System.out.println("2: Sinh vien Luat");
            System.out.print("Chon: ");
            int choice = s.nextInt();
            s.nextLine();
            SinhVien a;
            if (choice == 1) {
                a = new KeToan();
                a.nhapThongTin();
                ds.add(a);
            } else if (choice == 2) {
                a = new Luat();
                a.nhapThongTin();
                ds.add(a);
            }
        }
    }

    public void CapNhat(int id) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaSV() == id) {
                ds.get(i).capNhatThongTin();
            }
        }
    }

    public void Xuat() {
        for (int i = 0; i < ds.size(); i++) {
            ds.get(i).xuatThongTin();
            System.out.println();
        }

    }

    public void TimKiem(int id) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaSV() == id) {
                ds.get(i).xuatThongTin();
            }
        }
    }

    public void XoaSVDiemDuoiTrungBinh() {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getDiemTB() < 5.5) {
                ds.remove(i);
                i--;
            }

        }
    }

    public void SinhVienNhanHocBong() {
        System.out.println("Sinh vien nhap hoc bong");
        for (int i = 0; i < ds.size(); i++) {
            ds.get(i).xetHocBong();

        }
    }

}
