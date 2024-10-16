package command;

public class CommandExecuteProgramA implements Command{
    ServerInterface server;

    public CommandExecuteProgramA(ServerInterface server){
        this.server = server;
    }

    @Override
    public void execute() {
        server.runProgramA();
    }
}
