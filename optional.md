In this post, we will see how to use Java 8 Optional class effectively to handle null pointer exception in real time projects. How to handle null pointer in different layers like the controller layer, service layer, and DAO layer.

Key points about Java 8 Optional class:
null references have been historically introduced in programming languages to generally signal the absence of a value.
Java 8 introduces the class java.util.Optional to model the presence or absence of a value.
You can create Optional objects with the static factory methods Optional. empty, Optional.of, and Optional.ofNullable.
The Optional class supports many methods such as map, flatMap, and filter, which are conceptually similar to the methods of a stream.
Using Optional forces you to actively unwrap an optional to deal with the absence of a value; as a result, you protect your code against unintended null pointer exceptions.
Using Optional can help you design better APIs in which, just by reading the signature of a method, users can tell whether to expect an optional value. In this article, we will see how to use Java 8 Optional In Real-time Projects

http://www.javaguides.net/2018/07/handle-nullpointerexception-in-controller-service-and-dao-layer-using-java-8-optional-class.html
