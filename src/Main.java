import command.CommandExecuteProgramA;
import command.CommandExecuteProgramB;
import command.Server;
import command.ServerInterface;
import handlers.HighPriorityHandler;
import handlers.LowPriorityHandler;
import handlers.MiddlePriorityHandler;
import mediator.IncomingRequestMediatorInterface;
import mediator.LoadBalancer;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ServerInterface server = new Server();
        IncomingRequestMediatorInterface loadbalancer = new LoadBalancer(
                new HighPriorityHandler(),
                new MiddlePriorityHandler(),
                new LowPriorityHandler()
        );
        ClientInterface clientA = new ApplicationClient(
                loadbalancer,
                1,
                new CommandExecuteProgramA(server),
                new CommandExecuteProgramB(server)
        );
        ClientInterface clientB = new ApplicationClient(
                loadbalancer,
                2,
                new CommandExecuteProgramA(server),
                new CommandExecuteProgramB(server)
        );
        ClientInterface clientC = new ApplicationClient(
                loadbalancer,
                3,
                new CommandExecuteProgramA(server),
                new CommandExecuteProgramB(server)
        );
        clientC.doA();
        clientA.doA();
        clientB.doB();
        clientA.doB();
        clientB.doA();
        clientC.doB();

        System.out.println("History of execution.");
        for (Iterator<String> it = (server.getHistoryIterator()); it.hasNext(); ) {
            String e = it.next();
            System.out.println(e);
        }
    }
}
