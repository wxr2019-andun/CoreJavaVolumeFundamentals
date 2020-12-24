第 6 章 接 口、 lambda 表达式与内部类<br></br>

6 . 1.1   接 口 概 念<br></br>
在  Java 程序设计语言中， 接口不是类，而是对类的一组需求描述， 这些类要遵从接口描 述的统一格式进行定义。<br></br><br></br>
设问-接口被两个类实现 两个类实现方法结果不同 调用接口 指向哪个实现？<br></br>

6.1.2   接口的特性
接口不是类， 尤其不能使用 new 运算符实例化一个接口<br></br>
使用 instanceof 检查一个对象是否属于某个特定类一样，  也可以使用 instance 检查一个对象是否实现了某个特定的接口<br></br><br></br>
与可以建立类的继承关系一样， 接口也可以被扩展。这里允许存在多条从具有较高通用 性的接口到较高专用性的接口的链<br></br><br></br>
[ Java 程序设计语言有一个非常重要的内置接口， 称为 Cloneable]<br></br>
-可以有静态方法<br></br>
-无法实例化.类实现接口后必须重写接口方法<br></br>
-可以有常量.可以有默认方法实现<br></br>


6.1.3  接口与抽象类<br></br><br></br>
有些程序设计语言允许一个类有多个超类， 例如 C++。 我 们 将 此 特 性 称 为 多 重 继 承 ( multiple inheritance)。 而 Java 的设计者选择了不支持多继承， 其主要原因是多继承会让语言 本身变得非常复杂 （如同 C++)， 效率也会降低 （ 如同 Eiffel )。
实际上， 接口可以提供多重继承的大多数好处， 同时还能避免多重继承的复杂性和低效性。<br></br><br></br>

6.1.3  默认方法~<br></br>
6.1.6   解决默认方法冲突<br></br>
如果先在一个接口中将一个方法定义为默认方法， 然后又在超类或另一个接口中定义了 同样的方法， 会发生什么情况？<br></br><br></br>
-超类优先。 如果超类提供了一个具体方法， 同名而且有相同参数类型的默认方法会 被忽略。<br></br><br></br>
-接口冲突。 如果一个超接口提供了一个默认方法， 另一个接口提供了一个同名而且 参数类型 （不论是否是默认参数 ） 相同的方法， 必须覆盖这个方法来解决冲突<br></br>

6 . 2    接口示例<br></br>
6 . 2.1   接 口 与 回 调<br></br>
回调 （ callback) 是一种常见的程序设计模式。 在这种模式中， 可以指出某个特定事件发 生时应该采取的动作。<br></br>


6.2.2   Comparator 接口[对一个对象数组排序]<br></br>
6.2.3  对象克隆[ Cloneable 接口]<br></br>
 Cloneable 接口， 这个接口指示一个类提供了一个安全的 clone 方法<br></br><br></br>
 一个包含对象引用的变量建立副本时会发生什么原变量和副本都是同一个对象的引用（见图 6-1 )。 这说明， 任何一个变量改变都会影响另一 个变量。<br></br><br></br>
 ![img-six-1](i1.png "img-six-1")
 <br></br><br></br><br></br><br></br>
 

 默认的克隆操作 是“ 浅拷贝”， 并没有克隆对象中引用的其他对象。<br></br>
 浅拷贝会有什么影响吗？如果原对象和浅克隆对象共享的子对象是不可变的，那么这种共享就是安全的。果子对象属于一个不可变的类， 如 String, 就 是 这 种 情况。<br></br><br></br>
 或者在对象的生命期中,子对象一直包含不变的常量，没有更改器方法会改变它,也没有方法会生成它的引用，这种情况下同样是安全的。
 
 通常子对象都是可变的， 必须重新定义 clone 方法来建立一个深拷贝， 同时克隆 所有子对象。<br></br>
 对于每一个类， 需要确定：<br></br>
 1 ) 默 认 的  clone 方法是否满足要求；<br></br>
 2 )  是否可以在可变的子对象上调用 clone 来修补默认的 clone 方法；<br></br>
 3 ) 是否不该使用 clone0<br></br>
 
 
 6.3   lambda 表达式<br></br>
 使用 lambda 表达式采用一种简洁的语法定义代码块， 以及如何编写处理 lambda 表 达式的代码。<br></br>
 6.3.1   为什么引入  lambda 表达式<br></br>
 lambda 表达式是一个可传递的代码块， 可以在以后执行一次或多次。<br></br>
 
 6.3.2   lambda 表达式的语法<br></br>
 (String first, String second)->  first.length() - second.length();<br></br>
 () -> { for (int i= 100;i>= 0;i ) System.out.println(i); }<br></br>
 你已经见过 Java 中的一种 lambda 表达式形式： 参数， 箭头 （->) 以及一个表达式。<br></br><br></br>
 
 6 . 3.3  函 数 式 接 口<br></br>
 对于只有一个抽象方法的接口， 需要这种接口的对象时， 就可以提供一个  lambda 表达 式。这 种 接 口 称 为 函 数 式 接 口  （ functional interface )。<br></br><br></br>
 Arrays.sort (words ,(first,second)  ->  first.lengthO - second.length()) ;<br></br>

6.3.4   方法引用<br></br>
Timer t =  new Timer(1000, event ->  System.out.println(event)):<br></br><br></br>
但是， 如果直接把  println 方法传递到  Timer 构造器就更好了。具体做法如下： <br></br>
Timer t =  new Timer(1000, System.out::println);<br></br><br></br>
表达式  System.out::println 是一个方法引用 （ method reference ), 它等价于  lambda 表达式 x 一> System.out.println(x)()<br></br><br></br>
String::compareToIgnoreCase 等 同于 (x, y) -> x.compareToIgnoreCase(y)()<br></br><br></br>

6.3.5  构造器引用
