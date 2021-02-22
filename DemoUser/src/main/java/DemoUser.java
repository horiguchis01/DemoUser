public class DemoUser {
    private static final int MINIMUM_USERNAME_LENGTH = 10;
    private static final int MINIMUM_PASSWORD_LENGTH = 8;

    private String userName;
    private String password;

    public DemoUser(String userName, String password) {
        if (userName.length() < MINIMUM_USERNAME_LENGTH) {
            throw new IllegalArgumentException("too short userName.");
        }
        if (password.length() < MINIMUM_PASSWORD_LENGTH) {
            throw new IllegalArgumentException("too short userName.");
        }
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
