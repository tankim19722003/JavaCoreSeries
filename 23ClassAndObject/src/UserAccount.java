public class UserAccount {

    // thuộc tính (attribute)
    private String account;
    private String password;

    // xây dụng ( constructor)
    public UserAccount() {

    }

    // getter/setter
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

//    public static void main(String[] args) {
//
//        UserAccount devJava = new UserAccount();
//
//        devJava.setAccount("DevJava");
//        devJava.setPassword("12345");
//
//        System.out.println("Account: " + devJava.account);
//        System.out.println("Password: " + devJava.getPassword());
//
//        // create second user
//        UserAccount devJava2 = new UserAccount();
//
//        devJava.setAccount("DevPHP");
//        devJava.setPassword("12345");
//
//        System.out.println("Account: " + devJava.getAccount());
//        System.out.println("Password: " + devJava.getPassword());
//    }
}
