class Logger {

    // Step 1: Create the single instance
    private static Logger instance = new Logger();

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger object created.");
    }

    // Step 3: Public method to access the object
    public static Logger getInstance() {
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
