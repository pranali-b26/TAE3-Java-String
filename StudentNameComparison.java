import java.util.*;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine();

        if (name1.equals(name2))
            System.out.println("Case-Sensitive: Same");
        else
            System.out.println("Case-Sensitive: Different");

        if (name1.equalsIgnoreCase(name2))
            System.out.println("Case-Insensitive: Same");
        else
            System.out.println("Case-Insensitive: Different");
    }
}
