package command;

import java.util.ArrayList;
import java.util.Iterator;

public class Server implements ServerInterface {
    private ArrayList<String> history = new ArrayList<>();
    @Override
    public void runProgramA(){
        System.out.println("Server executes program A.");
        history.add("Server executes program A.");
    }
    @Override
    public void runProgramB(){
        System.out.println("Server executes program B.");
        history.add("Server executes program B.");
    }

    public Iterator<String> getHistoryIterator(){
        return new HistoryIterator(history);
    }
}
