/**
 * Created by Rob on 10/9/14.
 */

import java.util.ArrayList;

public class RobsQueue {
    public static void main(String[] args) {

        ArrayList<String> myQueue = new ArrayList<String>();
        boolean empty;

//    void isEmpty(ArrayList<String> list) {
//        if (list.size() == 0) {
//            boolean empty = true;
//        } else {
//            boolean empty = false;
//        }
//    }

        System.out.println("Current queue is: " + myQueue);
        System.out.println("Current queue length is: " + myQueue.size());

        myQueue.add("Foo");
        myQueue.add("Bar");

        System.out.println("Current queue is: " + myQueue);
        System.out.println("Current queue length is: " + myQueue.size());
    }
}
