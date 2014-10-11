/**
 * Created by Rob on 10/10/14.
 */
import java.util.*;

public class RobsQueue {

    ArrayList<String> queue = new ArrayList<String>();

    public Boolean isEmpty() {
        if (queue.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList enqueue(String item) {
        queue.add(item);
        return queue;
    }

    public String dequeue() {
        String dequeuedItem = queue.get(0);
        queue.remove(0);
        System.out.println(dequeuedItem + " has been removed from the queue.");
        return dequeuedItem;
    }

    public int size() {
        return queue.size();
    }
}
