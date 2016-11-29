// Language Translation Exercise
// David Gary

// As one who has studied Mandarin Chinese,
// I would like a Scala program that would
// work with an input list of numbers
// written in English and/or Chinese pinyin,
// adds and multiplies the list.

val chinese: List[String] = List("ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi")
val english: List[String] = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

def go(someList: List[String]) = {
  val convertedList : List[Int] = convertListFromLang(someList)
  val filteredList: List[Int] = convertedList filter(_ > -1)
  print("Original List: ")
  myLangPrint(someList)
  println()
  print("Translated List: ")
  myNumberPrint(filteredList)
  println()
  print("Addition: ")
  printNumberAddition(filteredList)
  print(" = ")
  print(sum(filteredList))
  println()
  print("Multiplication: ")
  printNumberMultiple(filteredList)
  print(" = ")
  print(product(filteredList))
  println()
  println()
}
def convertListFromLang(someList: List[String]): List[Int] = {
  someList.map(a => langToNumber(a))
}
def langToNumber(t: String): Int = {
  t match {
    case "ling" => 0
    case "yi" => 1
    case "er" => 2
    case "san" => 3
    case "si" => 4
    case "wu" => 5
    case "liu" => 6
    case "qi" => 7
    case "ba" => 8
    case "jiu" => 9
    case "shi" => 10
    case "zero" => 0
    case "one" => 1
    case "two" => 2
    case "three" => 3
    case "four" => 4
    case "five" => 5
    case "six" => 6
    case "seven" => 7
    case "eight" => 8
    case "nine" => 9
    case "ten" => 10
    case _ => -1
  }
}
def myLangPrint(someList: List[String]): Unit = {
  if(!someList.isEmpty) {
    print(someList.head + " ")
    myLangPrint(someList.tail)
  }
}
def myNumberPrint(someList: List[Int]) : Unit = {
  if(!someList.isEmpty) {
    print(someList.head + " ")
    myNumberPrint(someList.tail)
  }
}
// come back to this method
def printNumberAddition(someList: List[Int]): Unit = {
  if(!someList.isEmpty)
    if(someList.length != 1) {
      print(someList.head + " + ")
      printNumberAddition(someList.tail)
    } else {
      print(someList.head)
      printNumberAddition(someList.tail)
    }
}
// come back to this method
def sum(someList: List[Int]) : Int = {
  someList match {
    case Nil => 0
    case e :: tail => e + sum(tail)
  }
}
// come back to this method
def printNumberMultiple(someList: List[Int]) : Unit = {
  if(!someList.isEmpty)
    if(someList.length != 1) {
      print(someList.head + " * ")
      printNumberMultiple(someList.tail)
    } else {
      print(someList.head)
      printNumberMultiple(someList.tail)
    }
}
def product(someList: List[Int]) : Int = {
  someList match {
    case Nil => 1
    case e :: tail => e * product(tail)
  }
}
go(List("yi", "josh", "three", "si"))
go(List("yi", "david", "shi", "fourteen"))