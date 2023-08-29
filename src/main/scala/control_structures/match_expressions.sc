// Scala has a match expression, which in its most basic use is like a Java switch statement
val i = 1
i match
  case 1 => println("one")
  case 2 => println("two")
  case _ => println("other")

val result = i match
  case 1 => "one"
  case 2 => "two"
  case _ => "other"


// getClassAsString is a method that takes a single argument of any type.
def getClassAsString(x: Matchable): String = x match
  case s: String => s"'$s' is a String"
  case i: Int => "Int"
  case d: Double => "Double"
  case l: List[?] => "List"
  case _ => "Unknown"

// examples
getClassAsString(1) // Int
getClassAsString("hello") // 'hello' is a String
getClassAsString(List(1, 2, 3)) // List