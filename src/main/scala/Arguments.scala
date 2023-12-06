//
////  def fact(n:Int , acc:Int): Int =
////    if (n<=1) acc
////    else fact (n-1,n*acc)
////  val factor =fact(15,1)
////  print(factor)
//
////  val str: String ="Hello , I am Learning scala "
////  println(str.charAt(2))
////  println(str.substring(7,11))
////  println(str.split(" ").toList)
////  println(str.startsWith("Hello"))
////  println(str.replace(" ","-"))
////  println(str.toLowerCase())
////  println(str.length)
//
////  val input = "Hi"
////  val input1: String = "Hello"
////  println(input.length())
////  println(input.concat(input1))
////  println(input + input1)
////  // string formating
////  val num1 = 12
////  val num2 = 23.44
////  println("%d %f %s".format(num1, num2, input1))
////  //replace
////  val original = "Hello, World!"
////  val replaced = original.replace('o', '0')
////  println(replaced)
////
////  val containsSubstring = original.contains("World")
////  println(containsSubstring)
////
////
////  val originalString = "Scala Program"
////  val substring = originalString.substring(4, 5)
////  println(substring)
////
////  val lower = input1.toUpperCase
////  println(lower)
//
//// It simplifies the process of writing a main method by
//// allowing you to define the application code directly
//// within the body of an object that extends App.
//
//
//
//
//
//
//
//
//
///* class - organizations data code
//instentanious - actual memory space of class
//new - instentanious of class
// */
//object Arguments extends App{
// val person=new Person("John",26)
// println(person.age)//age is class parameter not member
//  person.greet("Daniel")
//  person.greet()
//  val author= new Writer("Nithila","Dev",1812)
//  val imposter= new Writer("Ram","Dev",1922)
//  val novel = new Novel("Great expectation",1839,author)
//  println(novel.authorAge)
//  println(novel.isWrittenBy(imposter))
//
//  val count= new Counter
//  count.inc.print
//  count.inc.inc.inc.print
//
//}
//class Person(name:String , val age:Int) //constructor
//{
//  def greet(name:String): Unit =println(s"${this.name} says: hi ,$name")
// // can have function definition , expression
//  def greet(): Unit = println(s"Hi , I am $name")
//
//  //multiple constructor
//
//  def this()=this("nithila",0)
//}
///* Novel and writer
////  writer: first name, surname,year
////  - method fullname
////  Novel : name , Year of release , author
////  - author age
////  - isWrittenBy(author)
////  - copy (new year of release)= new instance of novel
//   */
//
//class Writer(firstName:String , surname:String, val year:Int){
//  def fullName:String= firstName+" "+surname
//}
//class Novel(name:String ,  year:Int , author:Writer){
//  def authorAge= year - author.year
//  def isWrittenBy(author:Writer)= author == this.author
//  def copy(newYear: Int):Novel = new Novel(name,newYear,author)
//}
///* counter class(to map) to receive int value
////     method returns current count
////     method to increment/decrememnt counter => new counter
////     overload inc/dec to receive an amount
////   */
//
//class Counter(val count: Int=0){
//  def inc = {
//    println("Incrementing")
//    new Counter(count+1) //immutability
//  }
//
//  def dec = {
//    println("Decrementing")
//    new Counter(count-1)
//  }
//  def print = println(count)
//
//}