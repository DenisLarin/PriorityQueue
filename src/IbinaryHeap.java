/**
 * Created by denis__larin on 26.04.17.
 */
public interface IbinaryHeap<E> {
    public void insert(int key,E data);
    public Node<E> get();
    public Node<E> first();
    public Node<E> last();
}
