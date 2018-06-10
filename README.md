This repository contains all the new features introduced in detail. As the name suggest , the Java8 features were never defined in such detail on any blog or website. I have gathered them in a pieces and make this gem. So let's enjoy it .


# Lambda Expression

Lambda Expression is just an anonymous (nameless) function. That means the function which
doesn’t have the name, return type and access modifiers. Lambda Expression also known as anonymous functions or closures.

```java
public void m1() {
 sop(“hello”);
}
```
The above method can be written as below in lambda expression :

```java
() -> {
 sop(“hello”);
 }
 
() -> { sop(“hello”); }

() -> sop(“hello”);
```

**Example 2:**

```java
public void add(inta, int b) {
 sop(a+b);
}
```
can be written as 

```java
(inta, int b) -> sop(a+b);
```

If the type of the parameter can be decided by compiler automatically based on the context then
we can remove types also.The above Lambda expression we can rewrite as 

```java
(a,b) -> sop (a+b);
```

## Important points about lamba expression

1. A lambda expression can have zero or more number of parameters (arguments).

Example

```java

- () -> sop(“hello”);
- (int a ) -> sop(a);
- (inta, int b) -> return a+b;
```
2. Usually we can specify type of parameter. If the compiler expects the type based on the context
then we can remove type. i.e., programmer is not required.

```java
(inta, int b) -> sop(a+b);
 ```
can be written as ```java (a,b) -> sop(a+b); ```

3. If multiple parameters present then these parameters should be separated with comma (,).
4. If zero number of parameters available then we have to use empty parameter **[ like ()]**.
```java
Ex: ()  sop(“hello”);
```
5. If only one parameter is available and if the compiler can expect the type then we can remove the
type and parenthesis also.

```java 
(int a) ->  sop(a);
above can e written as , we can remove the data type  
(a)-> sop(a);
we can remove the brackets as well since only one parameter
A -> sop(a);
```
6. Similar to method body lambda expression body also can contain multiple statements. If more
than one statements present then we have to enclose inside within curly braces. If one statement
present then curly braces are optional.

7. Once we write lambda expression we can call that expression just like a method, for this
functional interfaces are required.






# Streams

>To process objects of the collection, in 1.8 version Streams concept introduced

**What is the differences between Java.util.streams and Java.io streams?**

java.util streams meant for processing objects from the collection. Ie, it represents a stream of objects
from the collection but Java.io streams meant for processing binary and character data with respect to
file. i.e it represents stream of binary data or character data from the file .hence Java.io streams and
Java.util streams both are different.

**What is the difference between collection and stream?**

- If we want to represent a group of individual objects as a single entity then We should go for
collection.
- If we want to process a group of objects from the collection then we should go for streams.
- We can create a stream object to the collection by using stream() method of Collection interface.
stream() method is a default method added to the Collection in 1.8 version.
```java
List<Person> list = new ArrayList();
Stream = list.stream();
```
Stream is an interface present in java.util.stream. Once we got the stream, by using that we can
process objects of that collection.


## We can process the objects in the following 2 phases

1. Configuration
2. Processing

**1. Configuration**

We can configure either by using **filter** mechanism or by using **map** mechanism.

**Filtering:**

We can configure a filter to filter elements from the collection based on some boolean condition by using filter()method of Stream interface.

```java
public Stream filter(Predicate<T> t)
 ```
 
here **(Predicate<T > t )** can be a boolean valued function/lambda expression

Example :

```java
Stream s = c.stream();
Stream s1 = s.filter(i -> i%2==0);
```

Hence to filter elements of collection based on some Boolean condition we should go for filter()
method.

**Mapping:**

If we want to create a separate new object, for every object present in the collection based on our
requirement then we should go for map() method of Stream interface.

```java
public Stream map (Function f);
```
  
  
                     |
                     ---------it can be lamba expression also
                     
Example :

```java
Stream s = c.stream();
 Stream s1 = s.map(i-> i+10);
 ```
 
Once we performed configuration we can process objects by using several methods.

**2. Processing**

- processing by **collect()** method
- Processing by **count()** method
- Processing by **sorted()** method
- Processing by **min()** and **max()** methods
- **forEach()** method
- **toArray()** method
- **Stream.of()** method
