fun main(){
    school("akirachix")
    var x = mySelf("Sharon", 23)
    println(x)
    var car = word("jeep")
    println(car)
    myName("Ruth")



}

fun school(name: String){
    println(name[0].toString() + name[2].toString() + name[3].toString())

}

fun mySelf(x: String, y: Int):String{
    var name = "Hi my name is $x i am $y years old"
    return name

}

fun word(name: String):Int{
    var car = name.length
    return car
}
fun myName(name: String){
    if(name=="Maryann")
        println("That's me")
    else{println("I don't know who that is")}
}
