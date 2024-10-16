package handlers;

public class LowPriorityHandler extends BaseHandler{
    @Override
    public boolean handleRequest(CommandRequestInterface request) {
        if(request.getPriority() == 1){
            System.out.println("Low priority request: ");
            request.getCommand().execute();
            return true;
        }
        else {
            return passToNextHandler(request);
        }
    }
}
