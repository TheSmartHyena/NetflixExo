public class User {
    private String pseudo = "";
    private boolean isLoggedIn = false;

    private EUserRole role;

    public User(String pseudo, EUserRole role) {
        this.pseudo = pseudo;
        this.role = role;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void signin() {
        isLoggedIn = true;
    }

    public void logout() {
        isLoggedIn = false;
    }

    public EUserRole getRole() {
        return role;
    }

    public void setRole(EUserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "pseudo='" + this.pseudo + '\'' +
                ", isLoggedIn=" + this.isLoggedIn +
                ", role=" + Utils.userRoleToString(this.role) +
                '}';
    }
}
