class BankingSystem {
    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Balance deducted: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem obj = new BankingSystem();

        Thread t1 = new Thread(() -> obj.withdraw(700));
        Thread t2 = new Thread(() -> obj.withdraw(500));

        t1.start();
        t2.start();
    }
}
