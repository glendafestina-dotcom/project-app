package project1;

public class LoginApp {

    private String username;
    private String password;
    private String cellPhone;

    // Constructor
    public LoginApp(String username, String password, String cellPhone) {
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
    }

    // Username check
    public boolean checkUsername() {
        return username.contains("_") && username.length() <= 5;
    }

    // Password check
    public boolean checkPassword() {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()].*");
    }

    // Cellphone check (REGEX - required)
    public boolean checkCellphone() {
        return cellPhone.matches("^\\+27\\d{9}$");
    }

    // Register user
    public void registerUser() {

        if (checkUsername()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters long.");
        }

        if (checkPassword()) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }

        if (checkCellphone()) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
    }

    // Login check
    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) &&
               inputPassword.equals(password);
    }

    // Return login status
    public void returnLoginStatus(boolean status) {
        if (status) {
            System.out.println("Welcome user, it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
    }
}