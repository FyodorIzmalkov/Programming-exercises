package joshuabloch;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){
        ThreadSafeSingleton result = instance;
        if (result != null){
            return result;
        }

        synchronized (ThreadSafeSingleton.class){
            if (instance == null){
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    }
}
