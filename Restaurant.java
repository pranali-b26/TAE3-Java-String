class Restaurant {
    boolean foodReady = false;

    synchronized void prepare() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serve() {
        if (!foodReady) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> r.prepare());
        Thread waiter = new Thread(() -> r.serve());

        waiter.start();
        chef.start();
    }
}
