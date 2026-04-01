class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}
