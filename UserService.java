public class UserService {
    public void handleUser(Object user) {
        if (user == null) throw new NullPointerException();
        System.out.println("Handling user: " + user);
    }
}