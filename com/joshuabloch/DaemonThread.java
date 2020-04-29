package joshuabloch;

public class DaemonThread extends Thread {

    public DaemonThread (String name){
        super(name);
    }

    public void run(){

        if (Thread.currentThread().isDaemon()){
            System.out.println(getName() + "IS DAEMON THREAD");
        } else {
            System.out.println(getName() + "IS NOT DAEMON THREAD");
        }
    }


    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread("D1");
        DaemonThread d2 = new DaemonThread("D2");
        DaemonThread d3 = new DaemonThread("D3");
        d1.setDaemon(true);
        d3.setDaemon(true);

        d1.start();
        d2.start();
        d3.start();
    }
}
