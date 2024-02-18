package com.doganur.algorithmsolutiononhackerrank.easyproblems

/*
 * Complete the 'simpleArraySum' function below.

 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 * Ben bir Int türünde bir dizi alacağım ve bu dizinin elemanlarının toplamını döndüreceğim.
 */

fun simpleArraySumSolveWithLoop(ar: Array<Int>) : Int { //Bu çözümde dizi elemanlarını toplamak için döngü kullanılmıştır.

    var sum = 0

    for (element in ar) {
        sum += element
    }
    return sum //simpleArraySumFirstSolve fonksiyonu Int türünde bir değer döndüreceğini belirtildi. Yoksa bana Unit döndüreceğini düşünebilir.
}
fun simpleArraySumWithForEach(ar: Array<Int>): Int {

    var result = 0

    ar.forEach { element -> //forEach fonksiyonu Array'in tğm elemanlarını dolaşmamızı sağlar. For döngüsü yerine forEach fonksiyonu ile Array'in eleamanlarını gezerek toplama işlemini gerçekleştirdik.
        result += element
    }

    return result
}

// fun simpleArraySumWithSumFunc(ar: Array<Int>) = ar.sum() //Bu şekilde de yazılabilir.
fun simpleArraySumWithSumFunc(ar: Array<Int>): Int {

    return ar.sum() //sum fonksiyonu ile Array'in elemanlarının toplamını bulduk.
}
fun main(args: Array<String>) {

    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    println(simpleArraySumSolveWithLoop(ar))
    println(simpleArraySumWithForEach(ar))
    println(simpleArraySumWithSumFunc(ar))
}
