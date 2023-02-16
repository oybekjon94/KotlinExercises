package list

// kotlin multiple conditions
data class Country(val name: String, val population: Int)
fun main(){
    val countries = listOf(
        Country("Iran", 80840713),
        Country("Hungary",9845000),
        Country("Poland",38485000),
        Country("India",134251200),
        Country("Latvia",1978000),
        Country("Vietnam",95261000)
    )

    val r = countries.filter {
        it.name.startsWith("I")
                && it.population > 100_000
    }

    r.forEach{ println(it) }

}