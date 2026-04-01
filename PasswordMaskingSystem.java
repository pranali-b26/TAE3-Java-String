import java.util.*;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        String masked = pass.substring(0, pass.length()-2).replaceAll(".", "*")
                        + pass.substring(pass.length()-2);

        System.out.println("Masked Password: " + masked);
    }
}
