package student;

public class Luat extends SinhVien {

    private int diemToeic;

    public Luat() {
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap diem Toeic: ");
        diemToeic = s.nextInt();
        s.nextLine();
    }

    @Override
    public void capNhatThongTin() {
        super.capNhatThongTin();
        System.out.print("Diem Toeic: ");
        diemToeic = s.nextInt();
        s.nextLine();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Diem Toeic: " + diemToeic);
    }

    @Override
    public void xetHocBong() {
        if (getDiemTB() >= 9.0 && diemToeic >= 700) {
            System.out.println(getHoTen() + " co hoc bong");
        }
    }

}
