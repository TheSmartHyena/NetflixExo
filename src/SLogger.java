public class SLogger {
    private static Logger instance;

    private SLogger() {
    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }

        return instance;
    }
}
