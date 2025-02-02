import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<String> history = new ArrayList<String>();

    public Logger() {
        this.log("Logger initialized");
    }

    private String prependLog(String value) {
        StringBuilder result = new StringBuilder();

        result.append("Log n°: ");
        result.append(this.history.size());
        result.append(" => ");
        result.append(value);

        return result.toString();
    }

    public void log(String value) {
        String formattedLog = this.prependLog(value);
        this.history.add(formattedLog);
        System.out.println(formattedLog);
    }
}
