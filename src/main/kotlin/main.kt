fun main() {
    humans(1)
    humans(2)
    humans(11)
    humans(12)
    humans(21)
    humans(31)
    humans(111)
    humans(541)
}

fun humans(likes: Int) {
    var human = if ((likes - 11) % 100 == 0)
        "людям"
    else if (likes == 11)
        "людям"
    else if (((likes - 1) % 10) == 0)
        "человеку"
    else
        "людям"

    println("Понравилось $likes $human")
}

//|| ((likes - 11) % 10) == 0