import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {
    private static <T extends Object> void doSmth(T obj, Predicate<T> predicate){
        System.out.println(predicate.test(obj));
    }

    private static <T extends Number> void printAll(List<T> list, Consumer<T> printer){
        for(T integer : list){
            printer.accept(integer);
        }
    }

    private static <T, R extends Number> void convertAllToFloat(List<T> list, Function<T, R> converter){
        for (int i = 0; i < list.size(); i++) {
            T current = list.get(i);
            R converted = converter.apply(current);
            System.out.println("CONVERTED: " + converted);
        }
    }
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1, 10, 200, 101, -10, 0);
        Function<Integer, Float> conversionToFloat = (integer) -> (float) integer;
        convertAllToFloat(integerList, conversionToFloat);
        Predicate<Integer> predicate = (integer) -> integer > -100;
        Predicate<Integer> predicate2 = (integer) -> integer >= 0;
        Predicate<Integer> predicate3 = (integer) -> integer < 200;
        List<Predicate<Integer>> list = new ArrayList<>();
        list.addAll(Arrays.asList(predicate, predicate2, predicate3));
        integerList.stream().filter(predicate.and(predicate2)).forEach(System.out::println);
        integerList.stream().filter(((Predicate<Integer>) num -> num >= 1).and((Predicate<Integer>) num -> num < 100)).forEach(System.out::println);
        System.out.println();
        integerList.stream().filter(list.stream().reduce(x -> true, Predicate::and)).forEach(System.out::println);
    }
}
