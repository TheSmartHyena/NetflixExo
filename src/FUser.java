public class FUser {
    public static User createUser(String pseudo, EUserRole role) {
        return new User(pseudo, role);
    }
}
