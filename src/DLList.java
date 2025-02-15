
class DLNode<T> {
    T data;
    DLNode<T> prev, next;

    public DLNode(T data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class DLList<T> {
    private DLNode<T> head, tail;

    public DLList() {
        this.head = null;
        this.tail = null;
    }

    public void addy(T item) {
        DLNode<T> newNode = new DLNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) return;

        DLNode<T> curr = head;
        for (int i = 0; curr != null && i < pos; i++) {
            curr = curr.next;
        }

        if (curr == null) return;

        if (curr.prev != null) {
            curr.prev.next = curr.next;
        } else {
            head = curr.next;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        } else {
            tail = curr.prev;
        }
    }

    @Override
    public String toString() {
        if (head == null) return "Empty List";
        StringBuilder sb = new StringBuilder();
        DLNode<T> temp = head;
        while (temp != null) {
            sb.append(temp.data).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}
