//
////size of array cannot be changed
//// holds only same datatype
//// elements are accessed through index value
//object array {
//  def main(args: Array[String]): Unit = {
//    //Create array
//    val program: Array[String] = new Array[String](4)
//    // need not mentioned the type of value stored in array
//    // val program = new Array[String](4)
//    //assigning values to array
//    program(0) = "Python "
//    program(1) = "Java "
//    program(2) = "Scala "
//    program(3) = "C"
//    println(program(0))
//    // to print all the elements
//    for (programming <- program) {
//      print(programming)
//    }
//  }
//}
//
//
//
////  import scala.collection.mutable.ArrayBuffer
////
////  //delete elements
////  val originalArray = Array(1, 2, 3, 4, 5)
////  val elementsToDelete = Array(2, 4)
////  val newArrayBuffer = ArrayBuffer[Int]()
////  for (element <- originalArray) {
////    if (!elementsToDelete.contains(element)) {
////      newArrayBuffer += element
////    }
////  }
////  //convert array buffer to array
////  val newArray = newArrayBuffer.toArray
////  println(newArray.mkString(", "))
////
////
////  //add elements
////  val originalArray = Array(1, 2, 3, 4, 5)
////  val elementToAdd = 6
////  val newArray = originalArray :+ elementToAdd
////  println(newArray.mkString(", "))
//
//
