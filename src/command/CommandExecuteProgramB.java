package command;

public class CommandExecuteProgramB implements Command {
    public ServerInterface server;

    public CommandExecuteProgramB(ServerInterface server){
        this.server = server;
    }

    @Override
    public void execute() {
        server.runProgramB();
    }
}
