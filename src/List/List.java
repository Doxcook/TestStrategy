package List;
import Mode.Mode;


public class List {
    public static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue(){
            return value;
        }
    }

    Node head;
    Node tail;
    Mode mode;

    public List() {
        head = null;
        tail = null;
    }

    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }

    public void addToStart(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public void addToStart(Node node) {
        Node newNode = new Node(node.value);
        newNode.next = head;
        head = newNode;
    }
    public void addToEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void addToEnd(Node node) {
        Node newNode = new Node(node.value);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int peek(){
        return mode.peek();
    }
    public void push(int value){
        mode.push(value);
    }
    public void setMode(Mode mode){
        this.mode = mode;
    }

    @Override
    public String toString() {
        Node currentNode = head;
        String print ="";
        while (currentNode != null){
            print += currentNode.value + " ";
            currentNode = currentNode.next;
        }
        return print;
    }
}
