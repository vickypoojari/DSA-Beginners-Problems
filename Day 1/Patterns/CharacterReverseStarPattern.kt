fun main() {
    val n = 5

    for (i in 1..n) {
        for (j in n downTo i) {
            print((65+(n-j)).toChar())
        }
        println()
    }
}

//ABCDE
//ABCD
//ABC
//AB
//A