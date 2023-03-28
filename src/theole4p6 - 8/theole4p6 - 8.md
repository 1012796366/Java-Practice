# 第六题输出
*15.000000
<br>8*
<br>分析：代码
```java
A a = new B();
System.out.printf("%f\n",a.f(3,5));
```
接口 A 包含了方法 f，故而可以在下一行通过 a 调用类 B 重写的方法 f 并获得返回值。
<br>但由于接口 A 内并不包含方法 g 的声明，因而不可以通过 a 调用方法 g。
```java
B b=(B)a;
System.out.printf("%d\n",b.g(3,5));
```
上述代码先将 a 向下转型，类型转换为类 B 并让对象 b 指向它，而类 B 中包含方法 g，因而就可以通过实例 b 调用方法 g。
# 第七题输出
*p是接口变量*
<br>分析：接口不可以实例化，这意味着代码
```java
com p = new com();
```
是错误的，然而类似的代码
```java
com p=new com(){
  public void speak() {
     System.out.printf(“p是接口变量\n”);
  }
};
```
却能通过编译。此处实际上是使用匿名类重写了接口的方法 speak，从而可以定义类型为 com 的对象 p 并通过它去调用方法 speak 而不报错。
# 第八题输出
*96
<br>乘数超过99*
定义了异常 MyException，抽象类 A 定义抽象方法 f 并由 B 继承该类，类 B 中重写该方法，规定当任意参数大于 99 时抛出异常 MyException，否则返回两者之积。
<br>同时定义了对象 a 并指向类 B 创建的对象，在 try catch 块中调用类 B 重写的方法 f，当参数小于 99 时，正常显示乘数，当任意参数大于 99 时，抛出异常并在 catch 块中处理。