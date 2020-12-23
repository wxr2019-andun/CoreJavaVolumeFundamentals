java super关键字的用法如下：[https://www.yiibai.com/java/super-keyword.html]<br></br>
super可以用来引用直接父类的实例变量。<br></br>
super可以用来调用直接父类方法。<br></br>
super()可以用于调用直接父类构造函数。<br></br>


<br></br><br></br><br></br><br></br> <br></br><br></br><br></br><br></br>
Java this关键字详解【https://blog.csdn.net/weixin_42386014/article/details/81138684】<br></br>
 this.属性名称 指的是访问类中的成员变量，用来区分成员变量和局部变量（重名问题）<br></br>
 this.方法名称 用来访问本类的成员方法  让类中一个方法，访问该类里的另一个方法或实例变量。<br></br>
 this()访问构造方法~~
 
 
 <br></br><br></br><br></br><br></br> <br></br><br></br><br></br><br></br>
 Java中的static关键字[https://www.cnblogs.com/dolphin0520/p/3799052.html]<br></br><br></br>
 “static方法就是没有this的方法。在static方法内部不能调用非静态方法，反过来是可以的。而且可以在没有创建任何对象的前提下，仅仅通过类本身来调用static方法。这实际上正是static方法的主要用途。”<br></br>
 <br></br>方便在没有创建对象的情况下来进行调用（方法/变量）。
 
 <br></br>static方法:
 <br></br> 
 static方法一般称作静态方法，由于静态方法不依赖于任何对象就可以进行访问，因此对于静态方法来说，是没有this的，因为它不依附于任何对象，既然都没有对象，就谈不上this了。
  <br></br> 
 并且由于这个特性，在静态方法中不能访问类的非静态成员变量和非静态成员方法，因为非静态成员方法/变量都是必须依赖具体的对象才能够被调用。
 
 <br></br>static变量
  <br></br> 
  static变量也称作静态变量，静态变量和非静态变量的区别是：静态变量被所有的对象所共享，在内存中只有一个副本，它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化，存在多个副本，各个对象拥有的副本互不影响。
  
  <br></br> static代码块
  <br></br> 
static关键字还有一个比较关键的作用就是 用来形成静态代码块以优化程序性能。static块可以置于类中的任何地方，类中可以有多个static块。在类初次被加载的时候，会按照static块的顺序来执行每个static块，并且只会执行一次。
为什么说static块可以用来优化程序性能，是因为它的特性:只会在类加载的时候执行一次。


 <br></br><br></br><br></br><br></br> <br></br><br></br><br></br><br></br>
 浅析Java中的final关键字[https://www.cnblogs.com/dolphin0520/p/3736238.html]
 
<br></br>修饰类
<br></br> 
当用final修饰一个类时，表明这个类不能被继承。也就是说，如果一个类你永远不会让他被继承，就可以用final进行修饰。final类中的成员变量可以根据需要设为final，但是要注意final类中的所有成员方法都会被隐式地指定为final方法。

<br></br>修饰方法
<br></br> 
方法锁定，以防任何继承类修改它的含义；第二个原因是效率。在早期的Java实现版本中，会将final方法转为内嵌调用。<br></br> <br></br> 
只有在想明确禁止 该方法在子类中被覆盖的情况下才将方法设置为final的。

<br></br>修饰类
<br></br> 