
class SLNode<T> {
    T data;
    SLNode<T> next;

    public SLNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class SLList<T> {
    private SLNode<T> head;

    public SLList() {
        this.head = null;
    }

    public void addy(T item) {
        SLNode<T> newNode = new SLNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            SLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) return;

        if (pos == 0) {
            head = head.next;
            return;
        }

        SLNode<T> prev = null, curr = head;
        for (int i = 0; curr != null && i < pos; i++) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) return;

        prev.next = curr.next;
    }

    @Override
    public String toString() {
        if (head == null) return "Empty List";
        StringBuilder sb = new StringBuilder();
        SLNode<T> temp = head;
        while (temp != null) {
            sb.append(temp.data).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}
