
abstract class RequestHandler {
    protected RequestHandler nextHandler;

    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);

    public abstract boolean canHandleRequest(Request request);
    public abstract String name();
}
