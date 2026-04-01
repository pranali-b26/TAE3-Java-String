import java.util.*;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str);
        System.out.println("Total Words: " + st.countTokens());
    }
}
