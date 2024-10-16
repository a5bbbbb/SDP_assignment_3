package command;

import java.util.Iterator;
import java.util.List;

public class HistoryIterator implements Iterator<String> {
    private List<String> history;
    private int ind;

    public HistoryIterator(List<String> history){
        this.history = history;
        ind = 0;
    }

    @Override
    public boolean hasNext() {
        return (ind < history.size());
    }

    @Override
    public String next() {
        if(hasNext())
            return history.get(ind++);
        return null;
    }
}
