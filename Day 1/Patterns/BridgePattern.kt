fun main() {
    val n = 5

    var space = 2*(n-1)
    for (i in 1..n) {
        for (j in 1..i) {
            print(j)
        }

        for (j in 1..space) {
            print(" ")
        }

        for (j in i downTo 1) {
            print(j)
        }

        space -= 2
        println()
    }
}


//1        1
//12      21
//123    321
//1234  4321
//1234554321