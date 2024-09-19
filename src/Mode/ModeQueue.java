package Mode;
import List.List;

public class ModeQueue implements Mode {
    private List list;

    public ModeQueue(List list) {
        this.list = list;
    }

    @Override
    public int peek() {
        return list.getHead().getValue();
    }

    @Override
    public void push(int value) {
        list.addToEnd(value);
    }
}
