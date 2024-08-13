public class Sum {

    private int a;
    private int b;

    // constructor : là hàm để tạo ra đối tượng, và không có giá trị trả về

    // hàm constructor không có đối số
    public Sum() {

    }

    // hàm constructor có đối số
    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }



    // hàm constructor truyền vào một đối tượng
    public Sum(Sum newSum) {
        this.a = newSum.getA();
        this.b = newSum.getB();
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {

        Sum sum = new Sum(3, 5);
        System.out.println("a1: " + sum.getA() + " b1: " + sum.getB() );

        Sum sum2 = new Sum(sum); // sum2(3,5)
        sum2.setA(88); // sum2(88,5)
        System.out.println("a2: " + sum2.getA() + " b2: " + sum2.getB() );
        System.out.println("------------------------");
        System.out.println("a1: " + sum.getA() + " b1: " + sum.getB() );


    }

}
