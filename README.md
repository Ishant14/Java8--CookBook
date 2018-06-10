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
()  {
 sop(“hello”);
 }
 
()  { sop(“hello”); }

()  sop(“hello”);
```
**Example 2**

```java
public void add(inta, int b) {
 sop(a+b);
}
```
can be written as 

```java
(inta, int b)  sop(a+b);
```

If the type of the parameter can be decided by compiler automatically based on the context then
we can remove types also.The above Lambda expression we can rewrite as (a,b)  sop (a+b);




# Stream 
