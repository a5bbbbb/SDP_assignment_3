package handlers;

public class HighPriorityHandler extends BaseHandler{
    @Override
    public boolean handleRequest(CommandRequestInterface request) {
        if(request.getPriority() == 3){
            System.out.println("High priority request: ");
            request.getCommand().execute();
            return true;
        }
        else {
            return nextHandler.handleRequest(request);
        }
    }
}
