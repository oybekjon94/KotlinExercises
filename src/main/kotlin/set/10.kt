package set

//set maximum
data class Car2(val name:String, val price: Int)
fun main(){
    val nums = setOf(11,5,23,8,1,9,6,2)

    println(nums.max())

    val cars = setOf(Car2("mazda",6300),Car2("toyota",12400),
    Car2("skoda",5670), Car2("mercedes",18600)
    )

    val car = cars.maxBy { car -> car.price }
    println("the max price is ${car.price} of ${car.name}")

}