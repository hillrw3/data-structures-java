/**
 * Created by Rob on 10/10/14.
 */
import java.util.ArrayList;

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
}
