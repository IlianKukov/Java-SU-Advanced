package _17Generics._03ArrayCreator;

import java.lang.reflect.Array;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = ArrayCreator.create(10,777);
        ArrayCreator.create(Integer.class,10,777);

        System.out.println();
    }
}
