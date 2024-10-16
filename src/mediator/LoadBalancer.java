package mediator;
import command.*;
import handlers.CommandRequestInterface;
import handlers.HandlerInterface;

public class LoadBalancer implements IncomingRequestMediatorInterface{
    private HandlerInterface head;

    public LoadBalancer(HandlerInterface head, HandlerInterface... handlerChain){
        this.head = head;
        for(HandlerInterface next : handlerChain){
            head.setNextHandler(next);
            head = next;
        }
    }

    @Override
    public void sendRequest(CommandRequestInterface request) {
        if(!head.handleRequest(request))
            System.out.println("Unknown type of request.");
    }
}
