package range

 fun main(){
  val rnums = (1..15)
  println(rnums)

  val r = rnums.filter { e -> e % 2 == 0 }
  println(r)

  val r2 = rnums.reduce{ total, next -> next * 2 -2}
  println(r2)

  val r3 = rnums.map {e -> e * 5}
  println(r3)
 }