import java.util.*;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int amount = sc.nextInt();

        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}
