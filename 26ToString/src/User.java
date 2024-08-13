import java.util.Objects;

public class User {

    // attribute
    private String name;
    private int age;

    //constructor

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // getter/setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // tostring
    @Override // annotation
    public String toString() {
        return "Name: " + getName() +" Age: " + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {

        User devJava = new User("Dev Java", 21);

        System.out.println(devJava);

        System.out.println("Hash code of object: " + devJava.hashCode());
    }
}

//FAFF41E9