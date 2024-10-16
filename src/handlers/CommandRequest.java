package handlers;
import command.*;

public class CommandRequest implements CommandRequestInterface{
    private Command command;
    private int priority;

    public CommandRequest(int priority, Command command){
        this.priority = priority;
        this.command = command;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public Command getCommand() {
        return command;
    }
}
