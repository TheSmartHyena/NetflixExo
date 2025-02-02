public class ChainCreate implements IRequestHandler {
    private IRequestHandler next = null;

    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        // ignore if not a CREATE
        if (request.getType() != ETypeRequest.CREATE) {
            next.handleRequest(request);
        }

        Movie movie = SDb.getInstance().create(request.getMovie());

        request.setStatus(true);
        request.setConclusion("A movie has been created with the id: " + movie.getId());
    }
}
