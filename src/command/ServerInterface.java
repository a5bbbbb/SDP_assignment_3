package command;

import java.util.Iterator;

public interface ServerInterface {
    void runProgramA();
    void runProgramB();
    Iterator<String> getHistoryIterator();
}
