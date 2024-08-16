package Service;

import java.util.Scanner;

public class UserService {

    // attribute
    private String account;
    private String password;


    // constructor
    public UserService() {
    }

    public UserService(String account, String password) {
        this.account = account;
        this.password = password;
    }

    // method

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // nhâp vào tài khoản mật khẩu người dùng
    public void enterAccount() {

        //tạo lớp Scanner
        Scanner sc = new Scanner(System.in);

        // nhập vào tài khoản
        System.out.println("Nhập vào tài khoản: ");
        account = sc.nextLine();
        // nhập vào mật khảu

        System.out.println("Nhập vào mật khẩu: ");
        password = sc.nextLine();

    }

    public void checkUserAccount() {

        if (account.equals("devjava") && password.equals("000")) {
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Tài khoản hoặc mật khẩu không hợp lệ!!");
        }
    }

    // toString


    @Override
    public String toString() {
        return "UserService{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
