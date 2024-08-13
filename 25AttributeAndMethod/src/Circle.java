import java.util.Objects;
import java.util.Scanner;

public class Circle {

    // attribute( thuộc tính)
    private double r;

    // constructor (Xây dựng)
    public Circle() {}

    public Circle(int r) {
        this.r = r;
    }


    // nhập r từ bàn phím
    public void  readData() {

        // tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);

        // nhập dữ liệu từ bàn phím
        System.out.println("Nhập bán kính r từ bàn phím: ");
        r = sc.nextDouble();

    }

    // method (Phương trình )
    public double dienTich() {

        final double pi = 3.14;

        double s = r * r * pi;

        return s;
    }


    // tính chu vi
    public double chuVi() {
        final double pi = 3.14;

        double c = r * 2 * pi;

        return c;

    }


    // getter/ setter
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


}
