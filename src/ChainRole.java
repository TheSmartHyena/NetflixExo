import java.util.Arrays;

public class ChainRole implements IRequestHandler {
    private IRequestHandler next = null;

    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (!Utils.isCudActions(request.getType())) {
            next.handleRequest(request);
        }

        // Check role if is admin
        if (!(request.getUser().getRole() == EUserRole.ADMIN)) {
            request.setStatus(false);
            request.setConclusion("User must be admin to perform a CREATE/UPDATE/DELETE action");
        } else {
            next.handleRequest(request);
        }
    }
}
