
import java.util.Arrays;

public class AList<T> {
    private T[] array;
    private int size;
    private int cap = 10;

    public AList() {
        array = (T[]) new Object[cap];
        size = 0;
    }

    public void addy(T item) {
        if (size == cap) {
            cap *= 2;
            T[] newData = (T[]) new Object[cap];
            System.arraycopy(array, 0, newData, 0, size);
            array = newData;
        }
        array[size++] = item;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
        }
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    @Override
    public String toString() {
        if (size == 0) return "Empty List";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append("\n");
        }
        return sb.toString();
    }
}
