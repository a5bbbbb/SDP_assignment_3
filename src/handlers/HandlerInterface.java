package handlers;

public interface HandlerInterface {
    boolean handleRequest(CommandRequestInterface request);
    void setNextHandler(HandlerInterface nextHandler);
}
