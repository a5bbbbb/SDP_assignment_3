package handlers;

public class MiddlePriorityHandler extends BaseHandler{
    @Override
    public boolean handleRequest(CommandRequestInterface request) {
        if(request.getPriority() == 2){
            System.out.println("Middle priority request: ");
            request.getCommand().execute();
            return true;
        }
        else {
            return passToNextHandler(request);
        }
    }
}
