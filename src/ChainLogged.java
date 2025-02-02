import java.util.Arrays;

public class ChainLogged implements IRequestHandler {
    private IRequestHandler next = null;

    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        ETypeRequest[] array = {ETypeRequest.CREATE, ETypeRequest.UPDATE, ETypeRequest.DELETE};

        // ignore if not a CREATE/UPDATE/DELETE
        // Instead of doing a || b || c, we do an array.contains to be easier to read and maintain
        if (!Arrays.asList(array).contains(request.getType())) {
            next.handleRequest(request);
        }

        // Check login status
        if (!request.getUser().isLoggedIn()) {
            request.setStatus(false);
            request.setConclusion("User must be logged to perform a CREATE/UPDATE/DELETE action");
        } else {
            next.handleRequest(request);
        }
    }
}
