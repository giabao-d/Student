package student;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DanhSachSV ds = new DanhSachSV();
        int choice = 1;
        do {
            System.out.println("Bang:");
            System.out.println("1: Nhap them sinh vien");
            System.out.println("2: Cap nhat thong tin sinh vien");
            System.out.println("3: Danh sach sinh vien");
            System.out.println("4: Tim kiem sinh vien");
            System.out.println("5: Xoa sinh vien duoi trun binh");
            System.out.println("6: Sinh vien dat hoc bong");
            System.out.println("0: Thoat");
            System.out.print("Chon: ");
            choice = s.nextInt();
            int id;
            switch (choice) {
                case 1:
                    ds.Nhap();
                    break;
                case 2:
                    System.out.print("Nhap ma sinh vien can cap nhat: ");
                    id = s.nextInt();
                    s.nextLine();
                    ds.CapNhat(id);
                    break;
                case 3:
                    ds.Xuat();
                    break;
                case 4:
                    System.out.print("Nhap ma sinh vien can cap nhat: ");
                    id = s.nextInt();
                    s.nextLine();
                    ds.TimKiem(id);
                    break;
                case 5:
                    ds.XoaSVDiemDuoiTrungBinh();
                    break;
                case 6:
                    ds.SinhVienNhanHocBong();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!...");
                    break;
                default:
                    System.out.println();
                    System.out.println("Error@<>$#(3{$");
                    System.out.println();
                    break;
            }
        } while (choice != 0);
        
    }
    
}
