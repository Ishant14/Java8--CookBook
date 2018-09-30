package com.ishant.comparatorchaining;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    public int compare(T t1, T t2);

    public static <T> Comparator<T> comparing(Function<T, Comparable> f){


        return (t1,t2) -> f.apply(t1).compareTo(f.apply(t2));

//        return new Comparator<T>() {
//            @Override
//            public int compare(T t1, T t2) {
//                return f.apply(t1).compareTo(f.apply(t2));
//            }
//        };
    }


    public default Comparator<T> thenComparing(Comparator<T> cmp){
//        return new Comparator<T>() {
//            @Override
//            public int compare(T t1, T t2) {
//                return compare(t1,t2) == 0 ? cmp.compare(t1,t2): compare(t1,t2);
//            }
//        };

        return (t1,t2) -> compare(t1,t2) == 0 ? cmp.compare(t1,t2) : compare(t1,t2);
    }
}
