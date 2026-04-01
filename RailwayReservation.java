class RailwayReservation {
    int seats = 1;

    synchronized void bookTicket() {
        if (seats > 0) {
            System.out.println("Ticket booked successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation obj = new RailwayReservation();

        Thread t1 = new Thread(() -> obj.bookTicket());
        Thread t2 = new Thread(() -> obj.bookTicket());

        t1.start();
        t2.start();
    }
}
