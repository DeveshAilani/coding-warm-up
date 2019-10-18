package basic.constructor

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Constructors {


    constructor(i: Int) {
        println("Constructor")
    }

    init {
        println("Init block")
    }
}

open class Shape {
    open fun draw() { /*...*/
    }

    fun fill() { /*...*/
    }
}

class Circle : Shape() {
    override fun draw() { /*...*/
    }
}

fun main() {
    //InitOrderDemo("Coding")
    Constructors(2)
}