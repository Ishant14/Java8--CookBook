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

**Example 2: **

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

**Important points about lamba expression **

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
