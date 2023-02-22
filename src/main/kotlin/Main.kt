fun main(){
    cities()
    places()
    sum()
    names("Winfrida","Ann","Mercy")

}
fun cities(){
    var city = arrayOf("Nairobi","Kisumu","Nakuru","Mombasa")
    println(city.contentToString())
}
fun places(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    var gramatical = println(cities.map { it.capitalize() })
    println(gramatical)
}
fun sum(){
    var number = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var add = number[2] + number[5]
    println(add)
    println(number.indexOf(158))
    print(number.sortedArray().contentToString())
}
fun names(name1: String,name2: String, name3: String): Array<String>{
    return arrayOf(name1,name2,name3)
}