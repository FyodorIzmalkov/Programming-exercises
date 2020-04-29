package scheduler.factory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulerPeriodically {
    private static int count = 0;
    private static int secondCount = 0;

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);

        Runnable task1 = () -> {
            count++;
            System.out.println("Running...task1 - count : " + count);
        };

        Runnable task2 = () -> {
            secondCount++;
            System.out.println("Running...task2 - secondCount: " + secondCount);
        };

        //init delay 5, repeat the task every 1 sec
        ScheduledFuture<?> scheduledFuture = ses.scheduleAtFixedRate(task1, 5, 1, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture2 = ses.scheduleAtFixedRate(task2, 3, 2, TimeUnit.SECONDS);

        while (true) {
            System.out.println("Count: " + count);
            Thread.sleep(1000);
            if (count == 10) {
                System.out.println("Count is 10, cancel the scheduledFuture!");
                scheduledFuture.cancel(true);
                scheduledFuture2.cancel(true);
                ses.shutdown();
                break;
            }
            if (secondCount == 2) {
                System.out.println("ENDING SECOND TASK");
                scheduledFuture2.cancel(true);
                secondCount = 0;
            }
        }
    }
}
