/**
 * Created by denis__larin on 26.04.17.
 */
public class Node<E>{
    private int key;
    private E data;

    public Node(int key, E data) {
        this.key = key;
        this.data = data;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
