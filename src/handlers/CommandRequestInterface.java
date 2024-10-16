package handlers;
import command.*;
public interface CommandRequestInterface {
    int getPriority();
    Command getCommand();
}
