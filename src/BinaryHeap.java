import java.util.ArrayList;


/**
 * Created by denis__larin on 26.04.17.
 */
public class BinaryHeap<E> implements IbinaryHeap<E> {
    private ArrayList<Node<E>> beanQueue;

    public BinaryHeap() {
        beanQueue = new ArrayList<Node<E>>();
    }
    @Override
    public void insert(int key, E data) {
        Node<E> node = new Node<>(key,data);
        beanQueue.add(node);
        upheap(beanQueue.size());
    }

    @Override
    public Node<E> get() {
        if(beanQueue.isEmpty())
            return null;
        swap(0,beanQueue.size()-1);
        Node<E> temp = beanQueue.remove(beanQueue.size()-1);
        downheap(0);
        return temp;
    }

    @Override
    public Node<E> first() {
        if(beanQueue.isEmpty())
            return null;
        Node<E> temp = beanQueue.get(0);
        return temp;
    }

    @Override
    public Node<E> last() {
        if(beanQueue.isEmpty())
            return null;
        Node<E> temp = beanQueue.get(beanQueue.size()-1);
        return temp;
    }

    private void downheap(int i) {
        int leftChildIndex;
        int rightChildIndex;
        int currentElementIndex;
        while (2*i+1<beanQueue.size()){
            leftChildIndex = 2*i+1;
            rightChildIndex = 2*i+2;
            currentElementIndex = leftChildIndex;
            if(rightChildIndex>beanQueue.size() && beanQueue.get(rightChildIndex).getKey()>beanQueue.get(leftChildIndex).getKey()){
                currentElementIndex = rightChildIndex;
            }
            if(beanQueue.get(i).getKey()>=beanQueue.get(currentElementIndex).getKey()){
                break;
            }
            swap(i,currentElementIndex);
            i = currentElementIndex;
        }
    }

    private void upheap(int size) {
        size--;
        while (beanQueue.get(size).getKey()>beanQueue.get((size-1)/2).getKey()){
            swap(size,(size-1)/2);
            size = (size-1)/2;
        }
    }

    private void swap(int size, int i) {
        Node<E> temp = beanQueue.get(size);
        beanQueue.set(size,beanQueue.get(i));
        beanQueue.set(i,temp);
    }
}
