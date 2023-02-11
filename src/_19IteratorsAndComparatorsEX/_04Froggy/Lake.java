package _19IteratorsAndComparatorsEX._04Froggy;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Lake implements Iterable<Integer>{
    private Integer[] numbers;

    public Lake(Integer... numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

//    private class Frog implements Iterator<Integer>{
//
//        private int totalCount;
//
//        private int getIndex(){
//
//
//        }
//        @Override
//        public boolean hasNext() {
//            return totalCount < numbers.length;
//        }
//
//        @Override
//        public Integer next() {
//            if (this.hasNext()){
//                return numbers[];
//            }
//            throw new NoSuchElementException();
//        }
//    }


}
