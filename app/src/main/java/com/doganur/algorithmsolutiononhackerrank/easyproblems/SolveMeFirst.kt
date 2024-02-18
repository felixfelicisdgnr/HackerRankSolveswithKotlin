package com.doganur.algorithmsolutiononhackerrank.easyproblems

import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

/*
Since we have already specified that all inputs will be integers,
we do not need to separately specify the return type.
 */
fun solveMeFirstTwo(a : Int, b: Int) = a + b

fun solveMeFirstThree(a: Int, b: Int) : Int =  a + b //Kotlin a ile b'nin toplamının Int olacağını anlar. Bu yüzden Int dönüş tipini belirtmeye gerek yoktur.

fun main() {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}