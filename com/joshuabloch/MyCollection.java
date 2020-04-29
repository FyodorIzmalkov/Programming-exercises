package joshuabloch;

import java.util.Arrays;

public class MyCollection<T extends Integer> {
    Integer[] array;
    Integer max;
    int curr;

    public MyCollection(int size){
        this.array = new Integer[size];
        max = Integer.MIN_VALUE;
        curr = 0;
    }

    public void add(T num){
        if (num.compareTo(max) > 0){
            max = num;
        }
        array[curr++] = num;
    }

    public Number removeLast(){
        return array[--curr];
    }

    public Number getMax(){
        return max;
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "array=" + Arrays.toString(array) +
                ", max=" + max +
                ", curr=" + curr +
                '}';
    }
}
