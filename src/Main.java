/**
 * Created by denis__larin on 26.04.17.
 */
public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap();
        binaryHeap.insert(2,1);
        binaryHeap.insert(11,2);
        binaryHeap.insert(9,3);
        binaryHeap.insert(12,4);
        binaryHeap.insert(8,5);
        binaryHeap.insert(13,6);
        binaryHeap.insert(7,7);
        binaryHeap.insert(230,8);
        binaryHeap.insert(12,9);
        binaryHeap.insert(145,10);
        System.out.println(binaryHeap.first().getData());
        System.out.println(binaryHeap.last().getData());
        System.out.println(binaryHeap.get().getData());
        System.out.println(binaryHeap.get().getData());
        System.out.println(binaryHeap.get().getData());
        System.out.println(binaryHeap.get().getData());
        System.out.println(binaryHeap.get().getData());
        System.out.println(binaryHeap.get().getData());
        System.out.println(binaryHeap.get().getData());
        System.out.println(binaryHeap.get().getData());
        System.out.println(binaryHeap.get().getData());
    }
}
