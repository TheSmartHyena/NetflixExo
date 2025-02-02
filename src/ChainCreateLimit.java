public class ChainCreateLimit implements IRequestHandler {
    private IRequestHandler next = null;

    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        // ignore if not a CREATE
        if (request.getType() != ETypeRequest.CREATE) {
            next.handleRequest(request);
        }

        // Check limit to 10
        if (SDb.getInstance().getSize() >= 10) {
            request.setStatus(false);
            request.setConclusion("DB can only have up to 10 items.");
        } else {
            next.handleRequest(request);
        }
    }
}
