package main;

import Service.UserService;

public class main {

    public static void main(String[] args) {

        UserService userService = new UserService();

        // nhập vào tài khoản và mật khẩu
        userService.enterAccount();

        // kiểm tra tài khoản mật khẩu đúng không
        userService.checkUserAccount();

    }

}
