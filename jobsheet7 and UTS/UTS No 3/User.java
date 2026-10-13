public class User {
    // Composition: the UserProfile is created by User and cannot exist without it
    private final UserProfile profile;
    private boolean loggedIn;

    public User(int userId, String password, String name, int age, String emailId) {
        this.profile = new UserProfile(userId, password, name, age, emailId);
    }

    public boolean logIn(int userId, int password) {
        if (userId == profile.getUserId() && String.valueOf(password).equals(profile.getPassword())) {
            loggedIn = true;
            System.out.println("Welcome, " + profile.getName() + "!");
        } else {
            System.out.println("Login failed: wrong user id or password");
        }
        return loggedIn;
    }

    public void recoverPassword() {
        System.out.println("A password recovery link was sent to " + profile.getEmail());
    }

    public void logOut() {
        loggedIn = false;
        System.out.println(profile.getName() + " logged out");
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public UserProfile getProfile() {
        return profile;
    }
}