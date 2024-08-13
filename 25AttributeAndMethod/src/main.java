public class main {

    public static void main(String[] args) {

        // khởi tạo đối tượng
        Circle circle = new Circle();

        // nhập vào r
        circle.readData();

        // tính diện tích
        double s = circle.dienTich();
        System.out.println("Diện tích hình tròn có bán kính là " + circle.getR() + ":");
        System.out.print(circle.dienTich());

        // tính chu vi
        double c = circle.chuVi();
        System.out.println("\nChu vi hình tròn có bán kính là " + circle.getR() + ": ");
        System.out.print(c);

        System.out.println("\nhash code: " + circle.hashCode());
        System.out.println(circle);
        // có dữ liệu trả về hay không
        // có dữ liệu trả về:  public <kiểu dữ liệu trả về > <Tên hàm>
        // không có dữ liệu trả về: public void <tên hàm>


    }

}
