val b: Byte = 1
val i: Int = 1
val l: Long = 1
val s: Short = 1
val d: Double = 2.0
val f: Float = 3.0

val i_1 = 123 // defaults to Int
val j = 1.0 // defaults to Double

val x = 1_000L // val x: Long = 1000
val y = 2.2D //val y: Double = 2.2
val z = 3.3F //val z: Float = 3.3

var a = BigInt(1_234_567_890_987_654_321l)
var big_b = BigDecimal(123_456.789)

val name = "Bill" //String
val c = 'a' //Char

val firstName = "John"
val mi = 'C'
val lastName = "Doe"
println(s"Name: $firstName $mi $lastName") //
println(s"2 + 2 = ${2 + 2}")
val x_ = -1
print(s"x.abs = ${x.abs}")

val quote = """The essence of Scala:
              |Fusion of functional and object-oriented
              |programming in a typed setting.""".stripMargin