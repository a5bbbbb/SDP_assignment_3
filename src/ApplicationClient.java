import command.*;
import handlers.CommandRequest;
import handlers.CommandRequestInterface;
import mediator.IncomingRequestMediatorInterface;

public class ApplicationClient implements ClientInterface{
    private Command commandA;
    private Command commandB;
    private int clientPriority;
    private IncomingRequestMediatorInterface requestReceiver;

    public ApplicationClient(IncomingRequestMediatorInterface requestReceiver, int clientPriority, Command commandA, Command commandB){
        this.requestReceiver = requestReceiver;
        this.commandA = commandA;
        this.commandB = commandB;
        this.clientPriority = clientPriority;
    }

    private void sendRequest(Command command){
        CommandRequestInterface newRequest = new CommandRequest(clientPriority, command);
        requestReceiver.sendRequest(newRequest);
    }

    @Override
    public void doA() {
        sendRequest(commandA);
    }

    @Override
    public void doB() {
        sendRequest(commandB);
    }
}
