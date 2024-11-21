fun main() {
    val n = 5

    for (i in 1..n) {
        for (j in 1..i) {
            print((64+j).toChar())
        }
        println()
    }
}

//A
//AB
//ABC
//ABCD
//ABCDE



fun main() {
    val n = 5

    for (i in 1..n) {
        for (j in 1..i) {
            print((64+i).toChar())
        }
        println()
    }
}

//A
//BB
//CCC
//DDDD
//EEEEE