package firstprogram

class Zoo(length: Int = 100, width: Int = 40, height: Int = 100) {
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume ")
    }
    fun filter()//Demonstrating the use of filter concept
    {
        val animals = listOf("cat", "crocodile", "frog", "pig", "cow")
        println("$animals")

        val partZoo = animals.filter { it[0] == 'c' }
        println("In one part of Zoo we have these animals: $partZoo")

           }

    init {
        println("Zoo initializing")
    }
    init {
        // Volume of the cage
        println("Volume: ${width * length * height } ")
    }
    constructor(numberOfAnimals: Int) : this() { //Concept of secondary constructor
        // 5,000 cm^3 per animal + extra room so they don't end up fighting
        val cage = numberOfAnimals * 5000 * 2.2
        // calculate the height needed
        height = (cage / (length * width)).toInt()
    }
    var volume: Int     //Concept of getter and setter
        get() = width * height * length
        set(value) {
            length = (value * 100) + ((width * height) /100)-6000//value is recalculated incase another same animal is added to same cage.
        }
}

fun zooCage() {
    val myZoo = Zoo(numberOfAnimals=39)
    myZoo.printSize()
    myZoo.volume = 70
    myZoo.printSize()
    myZoo.filter()
}

fun main() {
    zooCage()
    //Demonstrating the use of hashmap concept
    val cures = hashMapOf("Lion" to "roar", "Cat" to "meow","cow" to "humma")
    println(cures.get("Cat"))
    //Demonstrating the use of pairs concept
    val animalGesture = "Lion" to "roarrrr"
    val (animal, sound) = animalGesture
    println("$animal makes the sound of $sound")
    val animalGesture1 = "Cat" to "meowww"
    val (animal1, sound1) = animalGesture1
    println("$animal1 makes the sound of $sound1")
    val animalGesture2 = "Cow" to "humma"
    val (animal2, sound2) = animalGesture2
    println("$animal2 makes the sound of $sound2")
}