package Mode;
import List.List;

public class ModeStack implements Mode{

    private List list;

    public ModeStack(List list) {
        this.list = list;
    }

    @Override
    public int peek() {
        return list.getTail().getValue();
    }

    @Override
    public void push(int value) {
        list.addToEnd(value);
    }
}
