/**
 * Created by Rob on 10/14/14.
 */
import java.util.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RobsQueueTest {

    @Test
    public void testIsEmpty() throws Exception {
        RobsQueue robsQueue = new RobsQueue();
        robsQueue.isEmpty();
    }

    @Test
    public void testEnqueue() throws Exception {
        RobsQueue robsQueue = new RobsQueue();
        robsQueue.enqueue("Hello");
           ArrayList<String> result = new ArrayList<String>(){{
           add("Hello");
        }};
        assertEquals(robsQueue.queue, result);
    }

    @Test
    public void testDequeue() throws Exception {
        RobsQueue robsQueue = new RobsQueue();
        robsQueue.enqueue("Hello");
        robsQueue.enqueue("World");
        String result = "Hello";
        ArrayList<String> queue_result = new ArrayList<String>(){{
            add("World");
        }};
        assertEquals(robsQueue.dequeue(), result);
        assertEquals(robsQueue.queue, queue_result);
    }
}
