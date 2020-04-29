package scheduler.factory;

import java.util.concurrent.*;

import static scheduler.factory.Main.task1;
import static scheduler.factory.Main.task3;

public class Scheduler2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Callable<Integer> task2 = () -> 10;

        task1();

        //run this task after 5 seconds, nonblock for task3, returns a future
        ScheduledFuture<Integer> schedule = ses.schedule(task2, 5, TimeUnit.SECONDS);

        task3();

        System.out.println(schedule.get());

        System.out.println("Shutdown!");

        ses.shutdown();
    }
}
