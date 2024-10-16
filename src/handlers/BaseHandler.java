package handlers;

public abstract class BaseHandler implements HandlerInterface{
    protected HandlerInterface nextHandler;
    @Override
    public void setNextHandler(HandlerInterface nextHandler){
        this.nextHandler = nextHandler;
    }

    protected boolean passToNextHandler(CommandRequestInterface request){
        if(nextHandler == null)
            return false;
        return nextHandler.handleRequest(request);
    }
}
