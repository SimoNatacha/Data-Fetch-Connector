package org.datafetchconnector.scheduler;

import org.datafetchconnector.schema.Queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DbWriter {

    private ExecutorService queueWrite = Executors.newFixedThreadPool(2);
    private Queue queue = Queue.getInstance();

    public void DbWrite() {

        System.out.println("Queue: " + queue.print() + "\n" + "queue size before while: " + queue.getSize());

        while (!queue.isEmpty()) {
            queueWrite.execute(new QueueWriter(queue.dequeue()));

        }
        System.out.println("Saved Successfully");
        System.out.println("Queue: " + queue.print() + "\n" + "queue size after while: " + queue.getSize());
    }
}