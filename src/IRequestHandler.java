public interface IRequestHandler {
    void setNext(IRequestHandler next);
    void handleRequest(Request request);
}
