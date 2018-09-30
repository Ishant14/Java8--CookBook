package com.ishant.predicate;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    default Predicate<T> and(Predicate<T> other){
        return t -> test(t) && other.test(t);
        /*return new Predicate<T>() {
            @Override
            public boolean test(T t) {
                return Predicate.this.test(t) && other.test(t);
            }
        };*/
    }

    default Predicate<T> or(Predicate<T> other){
        return t-> test(t) || other.test(t);
    }

    public static <U> Predicate<U> isEqualsTo(U u){
        return s -> s.equals(u);
//        return new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.equals(string);
//            }
//        };
    }
}
