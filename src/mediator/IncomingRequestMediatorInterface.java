package mediator;
import handlers.CommandRequestInterface;

public interface IncomingRequestMediatorInterface {
    void sendRequest(CommandRequestInterface request);
}
