package m3;

public class Main {

    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Ivan");
        System.out.println(user.getName());
    }
}

interface UserBuilder{
    User create(String name);
}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}