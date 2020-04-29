package joshuabloch;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyList<T> implements Iterable<T> {
    private T[] array;

    public MyList (T[] array){
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private int curIndex = 0;

            @Override
            public boolean hasNext() {
                return curIndex < array.length && array[curIndex] != null;
            }

            @Override
            public T next() {
                return array[curIndex++];
            }
        };
        return iterator;
    }
}
