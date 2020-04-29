package scheduler.factory;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Runnable task2 = () -> System.out.println("Running task2 , time: " + new Date());

        task1();

        // run task after 5 seconds, nonblock for task 3
        ses.schedule(task2, 5, TimeUnit.SECONDS);

        task3();

        ses.shutdown();
    }

    public static void task1(){
        System.out.println("Running task 1...");
    }

    public static void task3(){
        System.out.println("Running task 3...");
    }
}
