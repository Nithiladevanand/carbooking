//
//object abstraction extends App{
////  def callbyvalue(x: Long): Unit = {
////    println("By value :" + x)
////    println("By value :" + x)
////  }
////  def callbyname(x: => Long): Unit = {
////    println("By Name :" + x)
////    println("By Name :" + x)
////  }
////  callbyvalue(System.nanoTime())
////  callbyname(System.nanoTime())
//
//
////  def fact(n:Int,acc:Int=1): Int= {
////    if (n<=1) acc
////    else fact(n-1 , n*acc)}
////    val fact_1=println(fact(10))
////    val fact10=println(fact(10,4))
////
////  def savepic(format:String="jpg",width:Int=800,height:Int):Unit = println("Saving pictures")
////  savepic(height=600)
////  savepic(width=300,height=400,format="jpg")
//
//
//
// ////Abstract class representing a geometric shape
//abstract class Shape {
//  def area(): Double }
//  class Circle(radius: Double) extends Shape {
//    def area(): Double = 3.14 * radius * radius }
//  class Rectangle(width: Double, height: Double) extends Shape {
//    def area(): Double = width * height }
//  object Main extends App {
//    val circle = new Circle(5.0)
//    val rectangle = new Rectangle(4.0, 6.0)
//    println(s"Area of the circle: ${circle.area()}")
//    println(s"Area of the rectangle: ${rectangle.area()}") }
//
//
//}
//
//
//
