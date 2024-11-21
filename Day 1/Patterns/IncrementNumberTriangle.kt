fun main() {
    val n = 5

    var counter = 1
    for (i in 1..n) {
        for (j in 1..i) {
            print("${counter} ")
            counter+=1
        }

        println()
    }
}


//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15