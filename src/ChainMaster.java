public class ChainMaster {
    private IRequestHandler firstChain;
    public ChainMaster() {
        this.firstChain = new ChainLogged(); // login check
        IRequestHandler chainRole = new ChainRole();
        IRequestHandler chainLimit = new ChainCreateLimit();
        IRequestHandler chainCreate = new ChainCreate();

        this.firstChain.setNext(chainRole);
        chainRole.setNext(chainLimit);
        chainLimit.setNext(chainCreate);
    }

    public void handleRequest(Request request) {
        // Before handling, we log the request
        SLogger.getInstance().log(request.toString());

        this.firstChain.handleRequest(request);

        // After handling, we log the request, should contain a conclusion
        SLogger.getInstance().log(request.toString());
    }
}
