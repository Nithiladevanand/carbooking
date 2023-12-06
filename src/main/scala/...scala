//// INHERITANCE //
//
////single level Inheritance //
//
//// Base class representing a person
//class Person(name: String, age: Int) {
//  def introduce(): Unit = println(s"My name is $name, and I am $age years old.")
//}
//
//// Subclass representing a student
//class Student(name: String, age: Int, school: String) extends Person(name, age) {
//  def study(): Unit = println(s"$name is a student at $school.")
//}
//object InheritanceExample {
//  def main(args: Array[String]): Unit = {
//    val person = new Person("Alice", 30)
//    val student = new Student("Bob", 20, "ABC School")
//    person.introduce()
//    student.introduce()
//    student.study()
//
//  }
//}
//



//
////multiple Inheritance //
//
//// Define a trait for swimming behavior
//trait Swimmer {
//  def swim(): Unit = println("Swimming")
//}
//
//// Define a trait for flying behavior
//trait Flyer {
//  def fly(): Unit = println("Flying")
//}
//
//// Define a class for a bird that can swim and fly
//class Bird(name: String) extends Swimmer with Flyer {
//  def speak(): Unit = println(s"$name is chirping")
//}
//
//object MultipleInheritanceExample {
//  def main(args: Array[String]): Unit = {
//    val bird = new Bird("Sparrow")
//    bird.speak()
//    bird.swim()
//    bird.fly()
//  }
//}
//
//
//
////Multilevel inheritance //
//
//// Define a base class
//class Animal(name: String) {
//  def speak(): Unit = println(s"$name makes a sound")
//}
//
//// Define a subclass that inherits from Animal
//class Dog(name: String, breed: String) extends Animal(name) {
//  def bark(): Unit = println(s"$name, a $breed dog, barks")
//}
//
//// Define another subclass that inherits from Dog
//class Puppy(name: String, breed: String) extends Dog(name, breed) {
//  def play(): Unit = println(s"$name, a cute $breed puppy, is playing")
//}
//
//object MultilevelInheritanceExample {
//  def main(args: Array[String]): Unit = {
//    val puppy = new Puppy("Buddy", "Golden Retriever")
//    puppy.speak()
//    puppy.bark()
//    puppy.play()
//  }
//}
////
////// HierarchicalInheritance Example
////// Base class
////class Animal(val name: String) {
////  def makeSound(): Unit = {
////    println("Some generic sound")
////  }
////}
////// Derived class 1
////class Dog(name: String, val breed: String) extends Animal(name) {
////  override def makeSound(): Unit = {
////    println("Woof! Woof!")
////  }
////  def fetch(): Unit = {
////    println("Fetching the ball")
////  }
////}
////// Derived class 2
////class Cat(name: String, val color: String) extends Animal(name) {
////  override def makeSound(): Unit = {
////    println("Meow!")
////  }
////
////  def climbTree(): Unit = {
////    println("Climbing the tree")
////  }
////}
////object HierarchicalInheritanceExample {
////  def main(args: Array[String]): Unit = {
////    val myDog = new Dog("Buddy", "Labrador")
////    val myCat = new Cat("Whiskers", "Gray")
////    myDog.makeSound()
////    myDog.fetch()
////    myCat.makeSound()
////    myCat.climbTree()
////  }
////}