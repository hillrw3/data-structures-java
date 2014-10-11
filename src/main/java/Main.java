/**
 * Created by Rob on 10/9/14.
 */
public class Main {
    public static void main(String[] args) {
        RobsQueue robsQueue = new RobsQueue();

        System.out.println("Robs queue is empty to start: " + robsQueue.isEmpty().toString());

        robsQueue.queue.add("Hello");

        System.out.println("Is the queue empty? " + robsQueue.isEmpty().toString());

        robsQueue.enqueue("Shazam");
        System.out.println(robsQueue.queue);

        robsQueue.dequeue();
//        System.out.println(robsQueue.queue);
        System.out.println(robsQueue.size());

    }
}
