package day4.design_pattern.singleton;

public class TongThong {
    private String hoTen;

    // Thuc the mac dinh la null
    private static TongThong instance = null;

    // Khoá ko cho phép tạo đối tượng từ bên ngoài
    private TongThong(String hoTen) {
        this.hoTen = hoTen;
    }
    public static TongThong getInstance() {
        if (instance == null) {
            instance = new TongThong("Nguyễn Văn Đô");
        }
        return instance;
    }
    public void duaRaQuyetDinh() {
        System.out.println("Tổng thống " + hoTen + " đưa ra quyết định ");
    }
    public void ThamGiaHoiNghi() {
        System.out.println("Tổng thống " + hoTen + " Tham gia hội nghi quốc gia");
    }
}
