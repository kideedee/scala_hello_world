val x = 1
if x < 0 then
  println("negative")
else if x == 0 then
  println("zero")
else
  println("positive")

val y = if x < 10 then x else 10
println(y)