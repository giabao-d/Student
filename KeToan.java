package student;

public class KeToan extends SinhVien {

    private float diemTinUngDung;

    public KeToan() {
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap diem tin ung dung: ");
        diemTinUngDung = s.nextFloat();
        s.nextLine();
    }

    @Override
    public void capNhatThongTin() {
        super.capNhatThongTin();
        System.out.print("Diem tin ung dung: ");
        diemTinUngDung = s.nextFloat();
        s.nextLine();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Diem tin ung dung: " + diemTinUngDung);
    }

    @Override
    public void xetHocBong() {
        if (getDiemTB() >= 9.0 && diemTinUngDung >= 9.5) {
            System.out.println(getHoTen() + " co hoc bong!");
        } 
    }

}
