package _17Generics._03ArrayCreator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    public static <T> List<T> create(int lenght, T item){

        List<T> list = new ArrayList<>();
        for (int i = 0; i <lenght ; i++) {
            list.add(item);
        }
        return list;

    }
    public static <T> T[] create(Class<T> tClass, int lenght, T item){

        T[] array = (T[]) Array.newInstance(tClass, lenght);
        for (int i = 0; i <lenght ; i++) {
            array[i]=item;
        }
        return array;

    }
}
