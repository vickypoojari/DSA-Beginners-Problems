fun main() {
    val n = 4

    for (i in 1..n) {
        for (j in 1..(n-i)) {
            print(" ")
        }

        var star = 65
        for(j in 1..(2*i-1)) {
            if(j<i) {
                print((star++).toChar())
            } else {
                print((star--).toChar())
            }
        }

        println()
    }
}

//   A
//  ABA
// ABCBA
//ABCDCBA