## Basics
- two variables with the same name cannot exist in the same scope
- JVM converts bytecode to machine code, JRE = JVM + libs this is what runs Java, JDK = JRE + SDK + javac (compiler) + java(interpreter) 
- the min requirement to generate bytecode (.class) is a class
- top level class cannot have static or protected
- a class without main method can be compiled but cannot be executed (no main method error)
- `import static` not static import
- static instantiation 
``` 
class AAA {

  public void main (String[] args) {
     System.out.println("Two")
  }

  static {
    System.out.println("One")
  }

  static {
    System.out.println("Two")
  }

  {System.out.println("Only when this class is instantiated")}
}

```
- System.out.print() does not exist, print must have an argument
- import com.foo.* doesn't include packages from com.foo.bar.* and other subpackages


## Data Types
- `_` can be used in literal numbers with exceptions: the beginning or end, next to decimal point, before l, d, or f 
- floating point doesn't throw ArithmeticException when divided by zero, it only results in NaN
- `Double.isNan(double)` or `Double.isNan()` on the value
- Integer `new Integer(string or int)`
- Integer Integer.`decode(string)` (can accept hex) 
- Integer Integer.`valueOf(string)`
- int Integer.`parseInt(String)` 
- by default `1.3` is a double, assigning it to float will cause type match error
- final can be init once, doesn't have to be in the same line
- local method variable has to be init before used, but it's not illegal to decalare it without value
- new Boolean("true") for true, new Boolean("anything else but not null") for false (this constructor is deprecated after 9)
- Double + null = null pointer exception
- `int x, y = 100` only initializes y
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
- `int` can be set with
```
// Decimal declaration and possible chars are [0-9]
int decimal    =  495;        

// HexaDecimal declaration starts with 0X or 0x and possible chars are [0-9A-Fa-f]
int hexa       =  0X1EF; 

// Octal declaration starts with 0 and possible chars are [0-7] 
int octal      =  0757;  

// Binary representation starts with 0B or 0b and possible chars are [0-1]  
int binary     =  0b111101111; 
```
- char can be passed to `method(int)` but int cannot be passed to `method(char)`
- `int a = 'c'` and `char a = 1` are ok

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
final int x;
x = 1;

switch (i) {
  case x : // wont compile because x is assigned later so it's not compile time constant
}

final x = 1;
switch (i) {
  case x + 1 : // works
}

```
- case has to refer to a constant value a.k.a final 
- `if` and `else if` will execute if condition is true, also if can take in assignment 
``` 
if (x = false) // this is valid 
```
- switch can use int, enum, String, char, but not long
- concat vs sum
``` 
System.out.print("a = " + 9 + 3) // a = 93
System.out.print("a = " + (9 + 3) // a = 12
System.out.print(9 + 3 + " a") // ! 12 a
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
- 
``` 
String[][] sss = {{"a","b"}, {"c"}};
System.out.println(sss[1][1]); // ArrayIndexOutOfBoundsException 
```
- Arrays.sort only takes in single array parameter where each element can be turned into Comparable, if the input is a multi-array then it casting an array to Comparable will cause ClassCastException
- Array.sort on String natural order would be : `number -> uppercase letters -> lowercase letters`
- Arrays.deepEquals(Object[], Object[]) is like Arrays.equals in that it tests if two arrays are equals but works on multi-dimensional arrays. 


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
- break without label in inner loop will only break that inner loop
- break vs continue with label
``` 
 Label: for (...){
     for(...) {
        break or continue Label;
     }
 }
 break will exit after the loop
 continue will exit at the beginning, continuing to next iteration
```
- for loop form
``` 
for (int i=0; i <5; i++, System.out.println(i));
// 1 2 3 4 5
```
- for loop invalid form
```
for (int i = 0, int j = 5; i < k; i++) // int data type can only be declared once
```
- see the difference between shadowing and normal 
``` 
    static int i = 10;
    public static void main(String[] args) {

        for (int i = 1; i < 3; i++) { // shadowing
            System.out.print(i);
        }
        System.out.print(i); // 1210
    }

    static int i = 10;
    public static void main(String[] args) {

        for (i = 1; i < 3; i++) {// this is not shadowing
            System.out.print(i);
        }
        System.out.print(i); //123

    }
```
- there's no difference between `for (int i = 1; i < 3; ++i) ` and `for (int i = 1; i < 3; i++)`
- for structure is `for(init, booleanCondition, update)`, all optional
``` 
for (int x =10, y =6; y < x; System.out.print(x--)) { // valid
```
- any statement after continue or break will cause compiler error Unreachable statement


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
- static methods cannot be overriden but subclass can have a method with a same signature, in this case it is treated as usual class method. 
- static loading
``` 
class Person{
    Person {
       System.out.print("First");
    }

    static {
        System.out.print("Second");
    }
}

class Manager extends Person {
    Manager{
        super()
         System.out.print("Fourth");
    }
    {System.out.print("Third");}

    
}
...
Person p = new Manager();
```
- overriding method can have final modifier
- if a class implements two interfaces that have the same default method (name and signature) then compiler will throw an error EXCEPT if the class overrides the duplicate methods
- order of initiation
``` 
- superclass
- static variables and static initializers from top
- instance variables and instance initializers from top
- constructor
```
- overriding method can have different return type as long as it's a subtype
``` 
super: Object method()
sub: String method()
```
- overriding method cannot throw a checked exception with broader scope that its parent



## Working with Methods and Encapsulation
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

## Handling Exceptions
- method can throw a superclass of exception that the content throws
``` 
void method() throws IOException{
  throw new FileNotFoundException(); // because this is a subclass of IOException
 // but the calling method will still catch FileNotFoundException is such block exists
}
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
- Throwable has two subclasses : Exception and Error (unchecked)
- SecurityException is not checked exception so no need to handle it in the calling method
- main method has two kinds of signature, either can be final
``` 
static void main(String[] args)
static void main(String...args)
```


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
- StringBuilder.inser(pos, el) with pos outside length will cause StringIndexArrayOutOfBoundExeption
- String.indexOf doesn't take in CharSequence
- String implements Comparable interface which can be used for .equals test
- LocalDate is immutable so `LocalDate.ofYearDay(2015,363).plusWeeks(2)` won't add weeks. 
- String doesn't have any method that affects the string it's invoked on

## Qs
- new array with non int size
- int like 056
- what if interfaces have same default methods
- which comes first, constructor or static init
- what if a class and its subclass implement a same interface that has a method, which one wins the implemented method or override method

## Easy misses
- else() doesn't exist
- variables with the same name in the same method