public class UserService {
    public void handleUser(Object user) {
        if (user == null) throw new IllegalArgumentException("User not found");
        System.out.println("Handling user: " + user);
    }
}