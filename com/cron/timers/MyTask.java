package cron.timers;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

    public MyTask() {
        System.out.println("Creating My Task. Time is: " + new Date());
    }

    @Override
    public void run() {
        Date date = new Date();
        System.out.println("-------------------------------------------------");
        System.out.println("This message should be displayed every 5 seconds.");
        System.out.println("Current time is: " + new Date());
    }
}
