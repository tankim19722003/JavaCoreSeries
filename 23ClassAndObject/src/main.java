public class main {

    public static void main(String[] args) {
        UserAccount devJava = new UserAccount();

        devJava.setAccount("DevJava");
        devJava.setPassword("12345");

        System.out.println("Account: " + devJava.getAccount());
        System.out.println("Password: " + devJava.getPassword());
    }
}
