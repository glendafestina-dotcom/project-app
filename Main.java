package project1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner put = new Scanner(System.in);

        String username;
        String password;
        String cellPhone;

        System.out.println("=== Register User ===");

        // Username loop
        while (true) {
            System.out.print("Enter username: ");
            username = put.nextLine();

            LoginApp temp = new LoginApp(username, "Temp123!", "+27830000000");

            if (temp.checkUsername()) break;
            else System.out.println("Invalid username!");
        }

        // Password loop
        while (true) {
            System.out.print("Enter password: ");
            password = put.nextLine();

            LoginApp temp = new LoginApp("temp_", password, "+27830000000");

            if (temp.checkPassword()) break;
            else System.out.println("Invalid password!");
        }

        // Cellphone loop
        while (true) {
            System.out.print("Enter cellphone (+27...): ");
            cellPhone = put.nextLine();

            LoginApp temp = new LoginApp("temp_", "Temp123!", cellPhone);

            if (temp.checkCellphone()) break;
            else System.out.println("Invalid cellphone!");
        }

        // Create user
        LoginApp user = new LoginApp(username, password, cellPhone);
        user.registerUser();

        // Login
        System.out.println("\n=== Login ===");

        System.out.print("Enter username: ");
        String loginUser = put.nextLine();

        System.out.print("Enter password: ");
        String loginPass = put.nextLine();

        boolean status = user.loginUser(loginUser, loginPass);
        user.returnLoginStatus(status);

        put.close();
    }
}
