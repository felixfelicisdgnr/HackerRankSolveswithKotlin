package com.doganur.algorithmsolutiononhackerrank.easyproblems


import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'simpleArraySum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 */

fun simpleArraySum(ar: Array<Int>): Int {

    var result = 0

    ar.forEach { it ->
        result += it
    }

    return result
}

/*

 */

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
