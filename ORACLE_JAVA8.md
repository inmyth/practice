## Basics
- two variables with the same name cannot exist in the same scope
- JVM converts bytecode to machine code, JRE = JVM + libs this is what runs Java, JDK = JRE + SDK + javac (compiler) + java(interpreter) 
- the min requirement to generate bytecode (.class) is a class
- top level class cannot have static or protected
- a class without main method can be compiled but cannot be executed (no main method error)
- `import static`

## Data Types
- `_` can be used in literal numbers with exceptions: the beginning or end, next to decimal point, before l, d, or f 
- Integer `new Integer(string or int)`
- Integer Integer.`decode(string)` (can accept hex) 
- Integer Integer.`valueOf(string)`
- int Integer.`parseInt(String)` 
- final can be init once, doesn't have to be in the same line
- local method variable has to be init before used, but it's not illegal to decalare it without value
- new Boolean("true") for true, new Boolean("anything else but not null") for false (this constructor is deprecated after 9)
- Double + null = null pointer exception
- short
``` 
short sh = 10;
sh++;
sh+=10;
sh = sh + 1 // error because right hand becomes int
```
- any variable in interface is final
``` 
interface A {
    String s = "s";
}

class B implemetns A {

    void method(){
      s = "b" // compile error
    }

}

```
- String cannot be converted to Character, Character only has `valueOf(char)`

## Operators and Decision Construct
- ++x and x++
``` 
  // the operation is evaluated before the statement
  int x = 1
  int y = ++x // y = 2
```
``` 
  // the statement is evaluated before the operation
  int x = 1
  int y = x++ //y = 1
```
- `x -= 2` is `x = x - 2`
- `x =- 2` is `x = -2`
- case in switch-case cannot take compile time constant
``` 
int x;
x = 1;

switch (i) {
  case x : // wont compile
}

final x = 1;
switch (i) {
  case x + 1 : // works
}

```
- `if` and `else if` will execute if condition is true, also if can take in assignment 
``` 
if (x = false) // this is valid 
```
- switch can use int, enum, String, char, but not long
- concat vs sum
``` 
System.out.print("a = " + 9 + 3) // a = 93
System.out.print("a = " + (9 + 3) // a = 12
```
- String equal
``` 
String a = "xx"
String b = "xx"

a == b // true because Java takes the same string from string pool
a.equals(b) // true

String c = new String("xx") 
a == c // false

```
## Array
- array of chars can be filled with int
- Arrays.sort(array, start, end) partially sorts an array between start and end
- array size cannot be long

## Loop Constructs
- `Object List.remove(index)` starts from the first
- do while always executes once
``` 
int x =10
while (x > 0) {
  do{
     x-=2;
  } while (x > 3)
  x--
  print(x)
}
//1-2
```
- `while(false)` will return compilation error unreachable statement
- break to outer loop will also end the inner loop



## Inheritance, Interface

- interface can have static method
- interface can have default method, overideable
- subclass can only override with same or looser access
- allowed downcast, ClassCastException:

```java
package com;
class A
{
    int i = 10;
}

class B extends A
{
    int j = 20;
}

class C extends B
{
    int k = 30;
}

public class ClassCastExceptionDemo
{
    public static void main(String[] args)
    {
        A a = new B();   //B type is auto up casted to A type
        B b = (B) a;     //A type is explicitly down casted to B type.
        C c = (C) b;    //Here, you will get class cast exception
        System.out.println(c.k);
    }
}

```

##
- pass by value
```
the original primitive will not change (String is NOT primitive)
private void change(int t){
   t = 1o;
}

// the array object will change
private void change(int[] t){
   t[0] = 10;
}
```
- char and int
```
  char can be used as int param
  static int change(int i){
      return i + 10;
  }
 
 change('c');

  int has to be cast as char to be used as char parram
  static char changes(char i){
     return 'a';
  }

  change((char)3);
```
- multi exceptions
```
try {

} catch (IOException name) {

} catch (SQLException name) {

}

catch (IOException|SQLException ex) {

}

```
- this will not compile as RuntimeException has been caught by Exception
``` 
try {

} catch (Exception e){

} catch (RuntimeException e){
  
}

```
- this will not compile as each of the exceptions must not be in the same hierarchy (similar with above). 
```
catch(Exception | RunTimeException e)
```
- exception is final
```
catch(XXXException e){
 e = new YYYException();
}
```
won't work
- `finally` always executes when try block exits
- `finally` without catch is legal
- All exceptions are checked exceptions, except for those indicated by Error, RuntimeException, and their subclasses.
- Errors and runtime exceptions are collectively known as unchecked exceptions.

## Java API
- StringBuilder initial capacity is initial content + 16, unless explicitly declared in constructor
- List.add(pos, val)
- Predicate is interface, its main functional method is `boolean test(T t)`
- ArrayList.toArray behavior 
Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array. If the list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.

```
List<String> list = new ArrayList<>();
list.add("A")
list.add("B")
list.add("C")
String[] arr = new String[2];
arr = list.toArray(arr);
// arr now is {A,B,C}

```
- Integer has method `max`
- Integer.max cannot be used to compare Object
- LocalDate.atTime(int hour, int minute) returns LocalDateTime
- LocalDate.getMonth return enum like MARCH, LocalDate.getMonthValue returns 3
- Period.ofMonths(13).normalized will return normalized form P1Y1M
- String res = String.concat("aa") will create two objects ("aa", and res)
- StringBuilder. getChars(int srcBegin, int srcEnd,  char[] dst, int dstBegin) dstBegin is offset in target array
- String constructors:
``` 
String()
String(byte[] bytes) // and other variations
String(char[] value) 
String(String original) // copy
String(StringBuffer buffer)
String(StringBuilder builder)
```
- String also has join: join(CharSequence delimiter, CharSequence... elements)
- LocalDate isn't smart it can readjust date if it doesn't exist
```
Year y = Year.of(2015)
LocalDate l = y.atMonthDay(MonthDay.of(4,31))
// exception because April 31st doesn't exist
```


