fun main() {
    var likes = 5540

    var human = if (((likes - 1)  % 10) == 0) {
        "человеку"
    } else {
        "людям"
    }

    println("Понравилось $likes $human")
}