//object main extends App{
// // 1. to print the numbers
//  for (i <- 1 to 10) {
//    println(i)
//  }
//
//  var i = 1
//  while (i <= 10) {
//    println(i)
//    i += 1
//  }
//
//  var i = 1
//  do {
//    println(i)
//    i += 1
//  } while (i <= 10)
//
//  //for each loop
//  val numbers = List(1, 2, 3, 4, 5)
//  numbers.foreach { z =>
//    println(z)
//  }
//
//  //foryield loop
//  val num = List(1, 2, 3, 4, 5)
//  val doublenum = for (n <- num) yield n
//  println(doublenum)
//
//  //2 & 3.To print sum of N
//  val n = scala.io.StdIn.readInt()
//  var sum=0
//  for (i <- 1 to n) {
//    println(i+" ")
//    sum += i
//  }
//  println(sum)
//
//   //4. To find average
//  var n : Double =scala.io.StdIn.readDouble()
//  var nInt= n.toInt
//  var sum =0
//  for(i <- 1 to nInt){
//    sum +=i
//  }
//  println(sum)
//  println(sum/n)
//
// //5.To print Cube value
//  var n = scala.io.StdIn.readInt()
////  var n= 10
//  for (i <- 1 to n){
//    val cube=i * i * i
//    println(s"$cube")
//  }
//
//  //6. Multiplication table & 7 . displaying it vertically
//  var number : Int = scala.io.StdIn.readInt()
//  for (i <- 1 to 10) {
//    val result = number * i
//    println(number+" * "+i+" = "+result)
//  }
//
//  //8. To print odd numbers and their sum
//  val n = scala.io.StdIn.readInt()
//  var sum = 0
//  var count = 1
//  var number = 1
//
//  while (count <= n) {
//    if (number % 2 == 1) {
//      print(number + " ")
//      sum += number
//      count += 1
//    }
//    number += 1
//  }
//  println()
//  println(s"The Sum of odd Numbers : $sum")
//
//  //9,10,11.pattern programs
//  val h = scala.io.StdIn.readInt()
//
//  for (i <- 1 to h) {
//    for (j <- 1 to i) {
//      print(i)
//    }
//    println()
//  }
//
//  //12.Pattern
//  var h= 10
//  var c = 1
//
//  for (i <- 1 to h) {
//    for (j <- 1 to i) {
//      print(c)
//      c += 1
//    }
//    println()
//  }
//
//  //13,14,15 Pattern to print in middle
//  val h = 4
//  var current = 1
//  for (i <- 1 to h) {
//    for (j <- 1 to h - i) {
//      print(" ")
//    }
//    for (k <- 1 to i) {
//      print(s"$i ")
//      current += 1
//    }
//    println()
//  }
//
//   //16. Factorial of given number
//  var n = scala.io.StdIn.readInt()
//  var fact = 1
//  if (n==1 || n==0){
//    println("1")
//  }
//  else{
//    for(i <- 2 to n){
//      fact=fact*i
//    }
//    println(fact)
//  }
//
// //17.sum of even numbers
//val n = scala.io.StdIn.readInt()
//    var sum = 0
//    var count = 1
//    var number = 1
//    while (count <= n) {
//      if (number % 2 == 0) {
//        print(number + " ")
//        sum += number
//        count += 1
//      }
//      number += 1
//    }
//    println()
//    println(s"The Sum of even Numbers : $sum")
//
//  val height = scala.io.StdIn.readInt()
//  var row = 1
//  while (row <= height) {
//    var col = 1
//    while (col <= row) {
//      print("* ")
//      col += 1
//    }
//    println()
//    row += 1
//  }
//
//}
//
//
//
//
////object number {
////  def main(args: Array[String]): Unit = {
////    var n = scala.io.StdIn.readInt()
////    var num = 0
////    while ((n % 10) > 0) {
////    var r = n % 10
////    num = num * 10 + r
////    n = n / 10
////  }
////
////  println(num)
////}
////}