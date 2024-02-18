package com.doganur.algorithmsolutiononhackerrank.easyproblems

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */
fun compareTripletsIfElse(a: Array<Int>, b: Array<Int>) : Array<Int> {
    var scoreAlice = 0
    var scoreBob = 0

    if (a[0] > b[0]) {
        scoreAlice += 1
    } else if (a[0] < b[0]) {
        scoreBob += 1
    }

    if (a[1] > b[1]) {
        scoreAlice += 1
    } else if (a[1] < b[1]) {
        scoreBob += 1
    }

    if (a[2] > b[2]) {
        scoreAlice += 1
    } else if (a[2] < b[2]) {
        scoreBob += 1
    }

    return arrayOf(scoreAlice, scoreBob) //Array<Int> türünde bir dizi döndürdüğümüz için arrayOf fonksiyonunu kullandık. arrayOf(0. elemanı, 1. elemanı) fonksiyonu ile dizi oluşturulur.
}

fun compareTripletsWithLoop(a: Array<Int>, b: Array<Int>) : Array<Int> {
    var scoreAlice = 0
    var scoreBob = 0

    for (i in 0..2) {
        if (a[i] > b[i]) {
            scoreAlice += 1
        } else if (a[i] < b[i]) {
            scoreBob += 1
        }
    }
    return arrayOf(scoreAlice, scoreBob)
}

fun compareTripletsWithCount(a: Array<Int>, b: Array<Int>) : Array<Int> {

    val scoreAlice = (0..2).count { a[it] > b[it] }
    val scoreBob = (0..2).count { a[it] < b[it] }

    return arrayOf(scoreAlice, scoreBob)
}

fun compareTripletsWithWhen(a: Array<Int>, b: Array<Int>) : Array<Int> {
    var scoreAlice = 0
    var scoreBob = 0

    for (i in 0..2) {
        when {
            a[i] > b[i] -> scoreAlice += 1
            a[i] < b[i] -> scoreBob += 1
        }
    }
    return arrayOf(scoreAlice, scoreBob)
}

fun compareTripletsWithZip(a: Array<Int>, b: Array<Int>) : Array<Int> {
    var scoreAlice = 0
    var scoreBob = 0

    for ((alice, bob) in a.zip(b)) {
        when {
            alice > bob -> scoreAlice += 1
            alice < bob -> scoreBob += 1
        }
    }
    return arrayOf(scoreAlice, scoreBob)
}
fun main() {
    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()


    println(compareTripletsIfElse(a, b).joinToString(" "))
    println(compareTripletsWithLoop(a, b).joinToString(" "))
    println(compareTripletsWithCount(a, b).joinToString(" "))
    println(compareTripletsWithWhen(a, b).joinToString(" "))
    println(compareTripletsWithZip(a, b).joinToString(" "))
}